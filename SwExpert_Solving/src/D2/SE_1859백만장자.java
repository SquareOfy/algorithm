package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SE_1859백만장자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testcase = br.readLine();
		int T = Integer.parseInt(testcase);
		for(int t=1; t<=T; t++) {
			
			//배열에 숫자 넣기
			String number = br.readLine();
			int N = Integer.parseInt(number);
			
			String[] Arr = br.readLine().split(" ");
			
			//매매가 배열에 입력
			int[] priceArr = new int[Arr.length];
			for(int i=0; i<N; i++) {
				priceArr[i] = Integer.parseInt(Arr[i]);
			}
			
			//max를 제일 끝 값으로 설정
			long max = priceArr[(N-1)];

			long maxSum = 0;
			
			//뒤에서부터(N-1제외) max와 비교하면서 max보다 작으면 max와의 차를 이익에 더할 것
			//max보다 크면 그 값을 다시 max로 지정
			for(int j =N-2; j>=0; j--) {
				if(max<priceArr[j]) {
					max = priceArr[j];
				}else {
					maxSum+= max-priceArr[j];
				}
			}

			
			
			System.out.println("#"+t+" "+maxSum);
		}
	}
}
	
		

	


