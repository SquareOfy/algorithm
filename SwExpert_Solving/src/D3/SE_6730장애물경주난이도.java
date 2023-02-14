package D3;

import java.util.Scanner;

public class SE_6730장애물경주난이도 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] blocks = new int[N];
			for(int i=0; i<N; i++) {
				blocks[i] = sc.nextInt();
			}
			int[] gapOfUp = new int[N-1];
			int upidx = 0;
			int[] gapOfDown = new int[N-1];
			int downidx =0;
 			for(int i=0; i<N-1; i++) {
				if(blocks[i]<blocks[i+1]) {
					gapOfUp[upidx]=blocks[i+1]-blocks[i];
					upidx ++;
				}
				else if(blocks[i]>blocks[i+1]) {
					gapOfDown[downidx]=blocks[i]-blocks[i+1];
					downidx ++;
				}
			}
 			System.out.printf("#%d %d %d \n",t,findMax(gapOfUp),findMax(gapOfDown));
 			
		}

	}
	
	public static int findMax(int[] Arr) {
		int result = 0;
		for(int i=0; i<Arr.length; i++) {
			if(result < Arr[i]) {
				result = Arr[i];
			}
		}
		return result;
		
	}

}
