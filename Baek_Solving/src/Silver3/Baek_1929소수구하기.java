package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1929소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int flag = 0;
		for(int i=M; i<=N; i++) {
			flag =0;
			if(i==1 || i==0) flag =1;
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) flag =1;
			}
			if(flag==0) System.out.println(i);
			
		}
		br.close();
	}
	

}
