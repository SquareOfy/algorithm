package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SE_1204최빈수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		String[] numArr;
		
		
		String T = br.readLine();
		int t = Integer.parseInt(T);
		
		for(int i =1; i<=t; i++) {
			String testcase = br.readLine();
			int testnum = Integer.parseInt(testcase);
			if(testnum<=t) {
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
}
