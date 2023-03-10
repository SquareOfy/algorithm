package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2750수정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] numArr = new int[T];
		for(int t=0; t<T; t++) {
			numArr[t] = Integer.parseInt(br.readLine());
		}
		int min = 0;
		for(int t=0; t<T; t++) {
			min = numArr[t];
			for(int j=t; j<T; j++) {
				if(numArr[j]<=min) {
					numArr[t]=numArr[j];
					numArr[j]=min;
					min = numArr[t];
				}
			}
			System.out.println(numArr[t]);
		}

	}

}
