package D3;

import java.util.Scanner;

public class SE_3431준환운동 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			int result = 0;
			if(X>U) {
				result = -1;
			}else if(X<L) {
				result = L-X;
			}
		System.out.printf("#%d %d \n", t, result);

		}
	}
}