package D2;

import java.util.Scanner;

public class SE_1974스도쿠검증2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][][] sudoku = new int[3][3][3][3];
		
		for(int r=0; r<3; r++) {
			for (int i=0; i<3; i++) {
				for(int c=0; c<3; c++) {
				
					for(int j=0; j<3; j++) {
						sudoku[r][c][i][j] = sc.nextInt();
					}
				}
			}
			
		}
		for(int r=0; r<3; r++) {
			
				for (int i=0; i<3; i++) {
					for(int c=0; c<3; c++) {
					for(int j=0; j<3; j++) {
						System.out.print(sudoku[r][c][i][j]+" ");
					}
		
				}
			}
			System.out.println();
		}
		

	}

}
