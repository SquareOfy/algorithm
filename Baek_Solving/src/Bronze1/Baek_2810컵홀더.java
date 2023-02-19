package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2810컵홀더 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[] seats = br.readLine().toCharArray();
		
		int cnt = 1;
		
		for(int i = 0; i<N; i++) {
			if(seats[i]=='S') {
				cnt++;
			}else if(i<N-1 && seats[i]=='L' && seats[i+1]=='L') {
				cnt++;
				i++;
			}
		}
		
		System.out.println(Math.min(N, cnt));
	}

}
