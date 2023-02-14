package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SE_1289원재메모리복구 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int t=1; t<=T; t++) {
			cnt = 0;
			String[] memory = br.readLine().split("");
//			if(memory[0].equals("1")) {
//				cnt++;
//			}
			if(memory[0].equals("1")) cnt ++;
			for(int i=0; i<memory.length-1; i++) {
				if(!(memory[i].equals(memory[i+1]))) {
					cnt ++;
				}
				
			}
			System.out.printf("#%d %d\n",t,cnt);
		}
	}

}
