package D3;

import java.util.Scanner;

public class SE_12221구구단2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int A = sc.nextInt(); int B= sc.nextInt();
			
			if(A>=10 || B>=10) {
				System.out.printf("#%d -1\n",t);
			}else System.out.printf("#%d %d\n",t,A*B);
		}
	}

}
