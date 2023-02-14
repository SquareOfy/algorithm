package D3;

import java.util.Scanner;

public class SE_1217거듭제곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=1; t<=10; t++) {
			int T = sc.nextInt();
			int num = sc.nextInt();
			int index = sc.nextInt();
			System.out.println("#"+t+" "+rExponetiation(num, index));
		}
	}
	
	public static int rExponetiation(int num, int index) {
		if (index ==0) {
			return 1;
		}
		return rExponetiation(num, index-1)*num;
	}

}
