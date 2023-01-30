package D2;

import java.util.Scanner;

public class SE_2005파스칼삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int[][] pascalArr = new int[N][N];
			for(int j = 0; j<N; j++) {
				for(int k=0; k<=j; k++) {
					if (k==0 || k==N-1 || j == 0) { 
						pascalArr[j][k]=1;
					}else {
						pascalArr[j][k] = pascalArr[j-1][k-1]+pascalArr[j-1][k];
					}
				}
			}
			System.out.println("#"+i);
			for(int j = 0; j<N; j++) {
				for(int k=0; k<=j; k++) {
					System.out.print(pascalArr[j][k]+" ");
				}
				System.out.println();
		}

	}

	}	
}
