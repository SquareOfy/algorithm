package D3;

import java.util.Scanner;

public class Baek_12368_24시간 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = A+B;
			if(result>=24) {
				result -= 24;
			}
			System.out.printf("#%d %d \n", t, result);
		}

	}

}
