package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SE_10505소득불균형 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int mean =0;
		int sum = 0;
		int cnt = 0;
		for(int t=1; t<=T; t++) {
			mean =0;
			sum = 0;
			cnt = 0;
			int N = Integer.parseInt(br.readLine());
			String[] numbers = br.readLine().split(" ");
			for(int i=0; i<N; i++) {
				sum += Integer.parseInt(numbers[i]);
			}
			mean = sum/N;
			for(int i=0; i<N; i++) {
				if(Integer.parseInt(numbers[i]) <= mean) cnt++;
			}
			System.out.printf("#%d %d \n", t, cnt);
		}

	}

}
