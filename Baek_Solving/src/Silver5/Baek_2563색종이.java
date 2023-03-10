package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2563색종이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int area =0;
		boolean[][] whitePaper = new boolean[100][100];
		for(int t =0; t<T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int i=x; i<x+10; i++) {
				for(int j=y; j<y+10; j++) {
					whitePaper[i][j] = true;
				}
			}
			
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if (whitePaper[i][j] ==true) {
					area ++;
				}
			}
		}
		
		System.out.println(area);

	}

}
