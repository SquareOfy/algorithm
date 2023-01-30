package D2;

import java.util.Scanner;

public class SE_1976시각덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int h=0;
			int m=0;
			if (m1+m2 >= 60) {
				m = m1+m2 -60;
				h+=(m1+m2)/60;
			}else {
				m = m1+m2;
			}
			if(h1+h2 > 12) {
				h += h1 + h2 -12;
			}else {
				h += h1 + h2;
			}
			System.out.printf("#%d %d %d \n", t, h, m);
			
		}

	}

}
