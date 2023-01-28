package D1;

import java.util.Scanner;

public class SE_1545거꾸로출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int output = N;
		for(int i=0; i<=N; i++) {
			System.out.print(output + " ");
			output--;
		}
		sc.close();
	}
}
