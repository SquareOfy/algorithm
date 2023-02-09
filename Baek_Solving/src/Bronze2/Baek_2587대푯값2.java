package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2587대푯값2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numArr = new int[10];
		int mean =0;
		int mid = 0;
		
		for(int t=0; t<5; t++) {
			int num = Integer.parseInt(br.readLine());
			mean+= num;
			numArr[num/10] +=1;
		}
		//평균 구하기
		mean /= 5;
		
		int temp = 0;
		boolean flag = false;
		//수 정렬
		for(int t=1; t<10; t++) {
			temp+= numArr[t];
			if(temp>=3 && flag ==false) {
				mid = t*10;
				flag = true;
				}
			}	
		System.out.println(mean);
		System.out.println(mid);
		

	}
}
