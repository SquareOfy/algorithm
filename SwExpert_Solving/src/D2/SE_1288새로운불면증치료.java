package D2;

import java.util.Scanner;

public class SE_1288새로운불면증치료 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	         
	        int T = sc.nextInt();
	         
	        for(int i=1; i<=T; i++) {
	            int[]numCount = new int [10];
	                int N = sc.nextInt();
	                int multiple = N;
	 
	                int flag = 0;
	                int cnt = 0;
	                while(flag != 10 ) {
	                    flag = 0;
	                    cnt += 1;
	                    String numString = Integer.toString(multiple);
	                     
	                    String[] digits = numString.split("");
	                 
	                    for(int j=0; j<digits.length; j++) {
	                        for(int k=0; k<10; k++) {
	                            if (Integer.parseInt(digits[j]) == k) {
	                                numCount[k] += 1;
//	                              System.out.println(k+"번째 1 더함");
	                            }
	                        }
	                    }
	                    multiple += N;
	                     
	                    for(int k=0; k<10; k++) {
	                        if (numCount[k] != 0) {
	                            flag += 1;
	                        }
	                    }
	                 
	                    if (flag == 10) {
	                        break;
	                    }
	                 
	                }
	                System.out.println("#"+i+" " + N*cnt);
	        }
	         
	}

}
