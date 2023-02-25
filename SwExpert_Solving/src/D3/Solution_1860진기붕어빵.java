package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1860진기붕어빵 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String result = "Possible";

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[] sec = new int[N];

			st = new StringTokenizer(br.readLine());
			int k = 0;
			while (st.hasMoreTokens()) {
				sec[k] = Integer.parseInt(st.nextToken());
				k++;
			}

			Arrays.sort(sec);

			int sum = 0; //현재 붕어빵의 개수 K -1 2K-1-1-1 3K 
			int time = 0; //시간  M 2M 3M ... 
			int idx = 0; // sec의 index를 어디까지 돌았는지 기억하기 위한 변수
			
			while (idx < N && time <= sec[N - 1]) {
				while(time+M<=sec[idx]) {
					time += M;
					sum += K;
				}
				
				if (time <= sec[idx] && time+M > sec[idx])  {
					sum--;
					idx++;
					
				}
				if (sum < 0) {
					result = "Impossible";
					break;
				}
			}

			System.out.printf("#%d %s \n", t, result);

		}

	}

}
