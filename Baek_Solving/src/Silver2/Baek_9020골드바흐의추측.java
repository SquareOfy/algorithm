package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_9020골드바흐의추측 {
	public static boolean isPrime(int num) {
		
		int flag = 0;
			outer : for(int j=2; j*j<=num; j++) {
				if(num==1 || num==0) {
					flag =1;
					break outer;
				}
				if(num%j==0) {
					flag =1;
					break outer;
				}
			}
			if(flag==0) return true;
			else return false;
			
		}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			
			int N = Integer.parseInt(br.readLine());
			int flag = 0;
			outer : for(int j=2; j*j<=num; j++) {
				if(num==1 || num==0) {
					flag =1;
					break outer;
				}
				if(num%j==0) {
					flag =1;
					break outer;
			
		}
		
		System.out.println();

	}

}
