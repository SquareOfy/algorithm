package D2;

import java.util.Scanner;

public class SE_1954달팽이숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int n = 1;
			int[][] numArr = new int[N][N];
			//첫줄 일단 입력
			for(int i=0; i<N; i++) {
				numArr[0][i] = n ++;
			}
			
			//n-1 2번 n-2 2번 .... 1 2번 
			//방향은 모듈4로 결정, 총 2n-2번 돌아 
			int cnt = 1;
			while(cnt < 2*N-2) {
				//N-1,,N-2,,,N-3,,,1 순으로 배열에 입력하는 숫자개수가 줄어듦.
				//이를 두번 해야함.
//				int flag =0;
//				int k = N-1;
				for(int k = N-1; k>0;k--) {
					for(int l=0; l<2; l++) {
						
//						if(flag ==1) {
//						flag =0;
//						k --;
//						}
						switch(cnt%4) {
						case 1:
					//아래로 내려가는 방향으로 
					//열 고정. 행 +됨.
					//행 시작 인덱스 : 1/ 2/ 3 / .. 1씩 늘어남
					//열 인덱스 : N-1부터 시작해서 1씩 줄어들기
							//1번째, 5번째, 9번째...
							//4로 나눈 몫 0/1/2
							//N-1   N-2   N-3
					//N-k 값 
							// k =N-1 : 1, 2, 3, ... N-1
							// k =N-3 : 3..? , 3, 4, ... N-1..
							for(int x=(cnt/4)+1; x<=(cnt/4)+k; x++) {
							numArr[x][N-1-(cnt/4)] = n++;
							}
							cnt++;
//							flag = 1;
							break;
					
						case 2:
							//오른쪽에서 왼쪽 방향
							//행 고정. 열 -됨.
							//열 시작 인덱스 : N-1 /N-2 .. 1씩 줄어듬
							//행 인덱스 : N-1부터 시작해서 1씩 줄어들기
									//2번째, 6번째, 10번째...
									//4로 나눈 몫 0/1/2
									//N-1   N-2   N-3
								for(int x=N-2-((cnt)/4); x>=N-1-k; x--) {
									numArr[N-1-((cnt)/4)][x] = n++;
									System.out.println(k);
								}
								cnt++;
//								flag = 1;
								break;
					
						case 3:
							//아래에서 위로
							//열 고정. 행 -됨.
							//열 인덱스 : 0부터 시작해서 1씩 늘어남.
									//3번째, 7번째, 11번째...
									//4로 나눈 몫 0/1/2 => 이게 열번호
							for(int x=N-2-((cnt)/4); x>=N-1-k; x--) {
									numArr[x][cnt/4] = n++;
							}
							cnt++;
//							flag = 1;
							break;
					
						case 0:
							//왼쪽에서 오른쪽으로
							//행 고정. 열 +됨.
							//행 인덱스 : 1부터 시작해서 1씩 늘어남.
									//4번째, 8번째, 12번째...
									//4로 나눈 몫 1/2/3 => 이게 행번호
							for(int x=1; x<=k; x++) {
									numArr[cnt/4][x] = n++;
								
							}
							cnt++;
//							flag = 1;
							break;
					
						}//switch 종료
					}//2번 반복 for문 종료
				}//k = N-1 for문 종료
//				
			}//while문 종료
		System.out.println("#"+t);
		for(int r =0; r<N; r++) {
			for(int c=0; c<N; c++) {
				System.out.printf("%d ", numArr[r][c]);
			}
			System.out.println();
		}

			

				
			

				}//t반복 for문 종료(테스트케이스)
			}//main 종료 괄호
		}//class종료 괄호

	


