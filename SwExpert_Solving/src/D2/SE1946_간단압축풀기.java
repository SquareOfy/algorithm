package D2;

import java.util.Scanner;

public class SE1946_간단압축풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		for(int t=1; t<T; t++) {
			int N = sc.nextInt();
			for(int n=0; n<N; n++) {
				char ch = sc.next().charAt(0);
				int zipNum = sc.nextInt();
				if(zipNum - cnt > 0) {
					while(cnt<=10) {
						System.out.print(ch);
						cnt+=1;
					}
				}
			}
		}

	}

}
