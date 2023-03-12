package Silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_1018체스판다시칠해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] board = new char[N][M];

		for (int r = 0; r < N; r++) {
			String str = sc.next();
			for (int c = 0; c < M; c++) {
				board[r][c] = str.charAt(c);
			}
		}
	
		
		int min = 65;
		for (int r = 0; r < N - 7; r++) {
			for (int c = 0; c < M - 7; c++) {
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (board[r][c] == 'B') {
	
							if ((r + i) % 2 == 0) {// 0,2,4,6,8행  짝수열(0,2,..) 는 B여야함
								if ((c + j) % 2 == 0 && board[r + i][c + j] != 'B') {
									cnt++;
								
								} else if ((c + j) % 2 != 0 && board[r + i][c + j] != 'W') {
									cnt++;
								
								}
							} else { // 홀수 행 . 짝수번째 열이 W, 홀수번째 열이 B
								if ((c + j) % 2 == 0 && board[r + i][c + j] != 'W') {
									cnt++;
								
								} else if ((c + j) % 2 != 0 && board[r + i][c + j] != 'B') {
									cnt++;
								
								}
							}

						} else { // 맨 앞이 흰색일 때,
							if ((r + i) % 2 == 1) { // 홀수행 1,3,5,7 : 첫문자가 B(짝수열)
								if ((c + j) % 2 == 0 && board[r + i][c + j] != 'B') {
									cnt++;
									
								} else if ((c + j) % 2 != 0 && board[r + i][c + j] != 'W') {
									cnt++;
								
								}
							} else { // 짝수행 2,4,6,8 : 홀수열 : B / 짝수 열 : W
								if ((c + j) % 2 == 0 && board[r + i][c + j] != 'W') {
									cnt++;
									
								} else if ((c + j) % 2 != 0 && board[r + i][c + j] != 'B') {
									cnt++;
			
								}
							}
						}
						
					}

				}
				if (cnt < min)
					min = cnt;

			}
		}
		System.out.println(min);
	}

}
