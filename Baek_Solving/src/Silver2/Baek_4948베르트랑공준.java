package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_4948베르트랑공준 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			while(true) {
				int flag =0;
				int cnt = 0;
				int N = Integer.parseInt(br.readLine());
				if(N==0) break;
				for(int i=N+1; i<=2*N; i++) {
					flag =0;
					if(i==1 || i==0) flag =1;
					outer : for(int j=2; j*j<=i; j++) {
						if(i%j==0) {
						flag =1;
						break outer;
						}
					}
					if(flag==0) cnt++;
				}
				System.out.println(cnt);
			}	
			br.close();
		}

	}


