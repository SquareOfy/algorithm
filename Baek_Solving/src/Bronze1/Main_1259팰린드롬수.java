package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1259팰린드롬수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			String isPalin = "yes";
			char[] num = br.readLine().toCharArray();
			if(num[0]== '0') break;
			for(int i=0; i<num.length/2; i++) {
				if(num[i] != num[num.length-1-i]) {
					isPalin = "no";
				}
			}
			System.out.println(isPalin);

		}
		
		
		

	}

}
