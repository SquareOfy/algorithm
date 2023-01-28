package D1;

import java.util.Scanner;

public class SE_2071평균값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for (int i=1; i<=T; i++) {
			double sum = 0;
			for(int j=1; j<=10; j++) {
				double n = sc.nextInt();
				sum += n;
			}
			double mean = sum/10;
			System.out.println("#"+i+" "+String.format("%.0f", mean));
		}
	
		sc.close();
	}

}
