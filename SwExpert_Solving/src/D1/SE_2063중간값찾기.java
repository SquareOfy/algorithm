package D1;

import java.util.Arrays;
import java.util.Scanner;

public class SE_2063중간값찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		int[] numbers = new int[N];
		for (int i =0 ; i<N ; i++) {
			int A = sc.nextInt();
			numbers[i] = A;
			
		}

			
		Arrays.sort(numbers);
		System.out.println(numbers[N/2]);
		
		sc.close();
	}
}
