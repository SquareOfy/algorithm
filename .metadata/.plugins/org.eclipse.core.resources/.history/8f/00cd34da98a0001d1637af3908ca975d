package D2;

import java.util.Scanner;

public class SE_1974스도쿠검증 {

	public static void main(String[] args) {
//		int[][][][] sudoku = new int[3][3][3][3];
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int flag = 1;
		int[][] sudoku = new int[9][9];
	
		for(int t=1; t<=T; t++) {
			//스도쿠 배열 입력받기
			for(int r=0; r<9; r++) {
				for(int c=0; c<9; c++) {
					sudoku[r][c] = sc.nextInt();
				}
			}
			outer : for(int i=0; i<9; i++) {
				int[] rCheckArr = {0,0,0,0,0,0,0,0,0};
				int[] cCheckArr = {0,0,0,0,0,0,0,0,0};
				for(int j=0; j<9; j++) {
					rCheckArr[sudoku[i][j]-1] += 1;
					
					cCheckArr[sudoku[j][i]-1] += 1;
					
					if(rCheckArr[j] > 1 || cCheckArr[j]>1) {
						flag =0;
						break outer;
					}	
				}
				for(int l=0; l<7; l+=3) {
					
					for(int j=0; j<7; j+=3) {
						int[] CheckArr = {0,0,0,0,0,0,0,0,0};
						for(int k=0; k<3;k++) {
							CheckArr[sudoku[l][j+k]-1] += 1;
							CheckArr[sudoku[l+k][j]-1] += 1;
							CheckArr[sudoku[l][j]-1] -= 1;
							if(CheckArr[i] > 1 ) {
								flag =0;
								break outer;
							}
			
		
						}	
					}
				}
		
			
		}
		
			System.out.printf("#%d %d",t,flag);
			System.out.println();
		}

	}
}
