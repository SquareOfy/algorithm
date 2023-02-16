package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SE_1215회문 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1; t<=10; t++) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			char[][] words = new char[8][8];
			for(int i=0; i<8; i++) {
				String s = br.readLine();
				for(int j=0; j<8; j++) {
					words[i][j] = s.charAt(j);
				}
			}
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<9-N; j++) {
					char[] word =new char[N];
					char[] word2= new char[N];
					int flag = 0;
					int flag2 = 0;
					for(int k=0; k<N; k++) {
						word[k] = words[i][j+k];
						word2[k] = words[j+k][i];
					}
					for(int k=0; k<N/2; k++) {
 						if(word[k] != word[N-1-k]) { 
							flag =1;
						}
 						if(word2[k] != word2[N-1-k]) { 
							flag2 =1;
						}
					}
					if(flag==0) {
						cnt++;
					}
					if(flag2==0) {					
						cnt++;
					}
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
		}
	}
}

