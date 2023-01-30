package D2;

import java.util.Scanner;

public class SE_1926간단369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int flag;
		for(int i=1; i<=N; i++) {
			flag = 0;
			String n = String.valueOf(i);
			for(int j=0; j<n.length(); j++) {
				if(n.charAt(j) == '3' ||n.charAt(j) == '6' ||n.charAt(j) == '9' ) {
					System.out.print("-");
					flag = 1;
					
					}
				}
			
			if (flag == 0) {
				System.out.print(i);
			}
			System.out.print(" ");
			
		}
	}
}
