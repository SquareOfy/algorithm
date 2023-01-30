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
					rCheckArr[sudoku[i][j]-1] += 1; //i행 체크					
					cCheckArr[sudoku[j][i]-1] += 1; //i열 체크
					
					
					if(rCheckArr[j] > 1 || cCheckArr[j]>1) {
						flag =0;
						break outer;
					}	
				}
				for(int l=0; l<7; l+=3) {
					
					for(int j=0; j<7; j+=3) { //(l,j)부터 3x3 배열 체크
						int[] CheckArr = {0,0,0,0,0,0,0,0,0};
						for(int x=0; x<3;x++) {
							for(int y=0; y<3; y++) {
								rCheckArr[sudoku[l+x][j+y]-1] += 1;
							}
							
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
