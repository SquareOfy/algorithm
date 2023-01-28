package D1;

import java.util.Scanner;

public class SE_2029몫과나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r = a/b;
			int q = a%b;
			System.out.println("#"+ tc+" "+r+" "+q);
		}
		sc.close();
	}

}
