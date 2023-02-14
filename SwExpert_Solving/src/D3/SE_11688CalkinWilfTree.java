package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SE_11688CalkinWilfTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
	
		for(int t=1; t<=T; t++) {
			int a = 1;
			int b = 1;
			String[] input = br.readLine().split("");
			
			for(int i=0; i<input.length; i++) {
				
				if(input[i].equals("R")){
					a = a+b;
				}else if (input[i].equals("L")) {
					b = a+b;
				}
			}
			//a와 b의 최대공약수를 구해서 나눠줘야 하는데,,,(약분)
			//유클리드 호제법 쓸까? 
			int gcd =0;
			int m = a;
			int n = b;
			while(true) {
				if(m>n) {
					m= m%n;
				}else if(m<n) {
					n = n%m;
				}
		
				if(m ==0) {
					gcd =n;
					break;
				}
				if(n==0) {
					gcd = m;
					break;
				}
			}
			System.out.printf("#%d %d %d \n", t, a/gcd, b/gcd);
			
			
			
		}

	}

}
