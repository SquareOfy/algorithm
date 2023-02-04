package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SE_1204최빈수 {

	public static void main(String[] args) throws IOException {
		//버퍼로 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력받은 숫자를 넣을 배열
		String[] numArr;
		
		String T = br.readLine();
		int t = Integer.parseInt(T);
		//테스트 케이스 반복문
		for(int i =1; i<=t; i++) {
			//몇 번째 테스트케이스인지 입력 받기
			String testcase = br.readLine();
	
				int max =0;
				int[] cntArr=new int[101];
				
				numArr = br.readLine().split(" ");
				for(String n:numArr) {
					int N = Integer.parseInt(n);
					cntArr[N] += 1;
					
				}
				int idx = 0;	
				for(int j=0; j<101; j++) {
					if(max<=cntArr[j]) {
						max = cntArr[j];
						idx = j;
					}
				}
			System.out.println("#" +i + " "+idx);

				
		}

	}
}
