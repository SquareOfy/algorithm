package Bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_10989수정렬3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
				int[] numCnt =new int[10001];
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i ++ ) {
			int n = Integer.parseInt(br.readLine());
			numCnt[n] ++;
		}
		for(int i=1; i<10001; i++) {
			if(numCnt[i]!=0) {
				for(int j =0; j<numCnt[i]; j++) {
					bw.write(String.valueOf(i)+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
