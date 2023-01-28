package D1;

import java.util.Scanner;

public class SE_2068최대수 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] numbers = new int[10];
			
			for (int i =0 ; i<N ; i++) {
				int max = 0;
				for(int j = 0; j<10; j++) {
					numbers [j] = sc.nextInt();
					max = Math.max(max, numbers[j]);
				}
				System.out.println("#"+(i+1)+" "+max);
			}
			sc.close();
		}
		
}


