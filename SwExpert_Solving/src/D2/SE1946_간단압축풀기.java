package D2;

import java.util.Scanner;

public class SE1946_간단압축풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//배열이 10칸 다 찼을 때 넘어갈 수 있도록 인덱스 기억하기 위한 변수
		//printArr에서의 커서 위치..?
		int idx = 0;
		
		//너비 10으로 고정하기 위해 사용할 배열
		char[] printArr = new char[10];
		//테스트케이스만큼 반복 시작
		for(int t=1; t<=T; t++) {
			System.out.println("#"+ t);
			//N 입력 받기
			int N = sc.nextInt();
			for(int n=0; n<N; n++) {
				//반복할 알파벳 입력받기
				char ch = sc.next().charAt(0);
				//알파벳 개수
				int zipNum = sc.nextInt();
				for(int i=0; i<zipNum; i++) {
						printArr[idx++] = ch;
						if(idx==10) {
							for(int j=0; j<10; j++) {
								System.out.print(printArr[j]);
								printArr[j] = '\0';
								idx = 0;
							}	
//							System.out.println();
							if(n == N-1 && zipNum-i-1 ==0) {
								for(int j=0; j<idx; j++) {
									System.out.print(printArr[j]);
								}
							
							}
						}
					}
				}//N반복 괄호
			}//테스트케이스 괄호
		}//main 괄호

}//마지막 괄호


