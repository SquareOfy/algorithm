package D2;

import java.util.Scanner;

public class SE_1970쉬운거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			System.out.println("#"+t);
			for(int i=0; i<moneyArr.length; i++) {
				System.out.print(N / moneyArr[i]+ " ");
				N %= moneyArr[i];
				
			}
			System.out.println();
		}
	}
		
}
