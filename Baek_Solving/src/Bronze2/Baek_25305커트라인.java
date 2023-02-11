package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_25305커트라인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] scores = new int[N];
		for(int i=0; i<N; i++) {
			scores[i] = sc.nextInt();
		}
		int max = 100;
			
		for(int i=0; i<N; i++) {
			max = scores[i];	
			for(int j=i+1; j<N; j++) {
				if(scores[j]>=max) {
					scores[i]=scores[j];
					scores[j]=max;
					max = scores[i];
					}
				}
		}
		System.out.println(scores[k-1]);
		
	}

}
