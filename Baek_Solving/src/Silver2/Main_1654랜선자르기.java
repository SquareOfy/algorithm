package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1654랜선자르기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] line = new int[K];
		
		//랜선 길이 값을 배열에 받기 + 랜선 길이 중 최댓값 구하기
		int max =0;
		for (int i = 0; i < K; i++) {
			line[i] = Integer.parseInt(br.readLine());
			if(line[i]>max) {
				max = line[i];
			}
		}
		
		//가장 긴 랜선을 자르는 개수를 의미하는 divisor 변수
		//가장 긴 랜선을 divisor개로 잘랐을 때 잘린 랜선의 길이 = maxLine
		int divisor = 1;
		long maxLine = max/divisor; 
		
		//divisor를 N/K로 조정.
		if(N/K!=0)
			divisor = N/K;

		long cnt = 0;
		
		//잘린 조각의 개수가 N보다 작을 때까지 반복
		 while (cnt < N) {
			cnt = 0;
			for (int i = 0; i < K; i++) {
				cnt += line[i]/maxLine;
			}
			if(cnt >= N) break;
			maxLine = max/(++divisor);
			}

		System.out.println(maxLine);

	}

}
