package D1;

import java.util.Scanner;

public class SE_2019더블더블 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = 1;
		System.out.print
		(output + " ");
		for (int i =1 ; i<=n; i++) {
			output *= 2;
			System.out.print(output + " ");
		}
		sc.close();
	}

}
