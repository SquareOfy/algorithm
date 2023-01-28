package D1;

import java.util.Scanner;

public class SE_2072홀수만더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int sum = 0;
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				if (num%2 ==1) {
					sum +=num;
				}
			}
			System.out.println("#"+(i+1)+" " + sum);
		}
		sc.close();
	}
}
