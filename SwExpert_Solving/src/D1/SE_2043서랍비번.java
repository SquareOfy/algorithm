package D1;

import java.util.Scanner;

public class SE_2043서랍비번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		for(int i=K; i<=P; i++) {
			cnt +=1;
		}
		System.out.println(cnt);
		sc.close();
	}

}
