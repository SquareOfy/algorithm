package D3;

import java.util.Scanner;

public class SE_5601쥬스나누기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			System.out.printf("#%d ",t);
			for (int i = 0; i < N; i++) {
				System.out.printf("1/%d ", N);
			}	
			System.out.println();

		}

	}
}
