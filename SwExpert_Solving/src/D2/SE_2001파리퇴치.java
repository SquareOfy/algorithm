package D2;

import java.util.Scanner;

public class SE_2001파리퇴치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int[][] numArr = new int[M][M];
			//2차원 배열 값 입력
			for(int r=0; r<M; r++) {
				for(int c=0; c<M; c++) {
					numArr[r][c] = sc.nextInt();
				}
			}
			int sum = 0;
			int max = 0;
			//배열의 (0,0)부터 N*N구역 합 구하기
			//M-N+1까지만 체크할 것(index오류 방지)
			for(int r=0; r<=M-N; r++) {
				for(int c=0; c<=M-N; c++) {
					sum =0;
					//N*N 구역 합
					for(int i=0; i<N; i++) {
						for(int j=0; j<N; j++) {
						sum += numArr[r+i][c+j];
						
						//최대값이라면 max값 변경하기
						max = Math.max(max, sum);
						}
					}
				}
			}
			System.out.printf("#%d %d",t,max);
			System.out.println();
		}
			
			

	}

}
