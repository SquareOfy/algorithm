package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_1244스위치켜고끄기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] switchArr = new int[T];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
			switchArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if(s==1) {
				int idx = num-1;
				while(idx < T) {
					switchArr[idx]++;
					idx = idx+num;
				}
				System.out.println("남자일 때, "+Arrays.toString(switchArr));
			
			}else {
				int k = 1;
				outer : while(num-1+k<T-1 && num-1-k>0) {
					if(switchArr[num-1+k] == switchArr[num-1-k]) {
						k++;
					}else {
						k--;
						break outer;
					}
				}
				System.out.println(k);
				for(int j=-k; j<=k; j++) {
					switchArr[num-1+j]++;
				}
				System.out.println("여자일 때 ," + Arrays.toString(switchArr));
			}
		
				
		}
		
		for(int t=0; t<T; t++) {
			System.out.print(switchArr[t]%2+" ");
			if(t==T-1) {
				System.out.println();
			}
		}
	}

}
