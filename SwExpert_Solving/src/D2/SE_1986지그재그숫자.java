package D2;

import java.util.Scanner;

public class SE_1986지그재그숫자 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	         
	        for (int i = 0; i < T; i++) {
	            int N = sc.nextInt();
	            int output=0;
	            for(int j=1; j<=N; j++) {
	                if (j%2 != 0) 
	                    output += j;
	                else
	                    output -= j;
	                }
	            System.out.println("#"+(i+1)+" "+output);

	        }	

	}
}
