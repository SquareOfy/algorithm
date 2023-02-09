package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_2751수정렬2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		for(int t=0; t<N; t++) {
			numArr[t] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(numArr);
//		int min = 0;
//		for(int t=0; t<N; t++) {
//			min = numArr[t];
//			for(int j=t; j<N; j++) {
//				if(numArr[j]<=min) {
//					numArr[t]=numArr[j];
//					numArr[j]=min;
//					min = numArr[t];
//				}
//			}
		for(int t=0; t<N; t++) {
			System.out.println(numArr[t]);
		}


	}
}


