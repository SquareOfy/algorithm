package D2;

import java.util.Scanner;

public class SE_1961숫자배열회전 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();			
			//배열 입력하기
			int[][] numArr = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					numArr[i][j] = sc.nextInt();
				}
			}
		//각 회전된 숫자열 넣을 배열 준비
		String[] rot90Arr = new String[N];
		String[] rot180Arr = new String[N];
		String[] rot270Arr = new String[N];
		System.out.println("#"+ t);
		//회전 배열에 공백 넣기 (null출력 막기 위해)
		for (int i=0; i<N; i++) {
			rot90Arr[i] = "";
			rot180Arr[i] = "";
			rot270Arr[i] = "";
		}

			for (int i=0; i<N; i++) { //고정 행 또는 열(나중에 움직이는 행 또는 열) 이자 회전 배열의 인덱스
				for(int j=0; j<N; j++) {//먼저 움직이는 행 또는 열					
						//행이 바뀔 동안 열이 고정이므로 i가 열, 행은 거꾸로 올라감
						rot90Arr[i] += String.valueOf(numArr[N-1-j][i]); 
						//열이 바뀔 동안 행이 고정이므로 i가 행, 열, 행 모두 거꾸로
						rot180Arr[i] += String.valueOf(numArr[N-1-i][N-1-j]);
						//행이 바뀔 동안 열 고정이므로 i가 열, 열 거꾸로, 행 그대로
						rot270Arr[i] += String.valueOf(numArr[j][N-1-i]);
					}
				System.out.printf("%s %s %s",rot90Arr[i],rot180Arr[i],rot270Arr[i]);
				System.out.println();
				}
				
				
				}
			}

	}


