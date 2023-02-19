package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2527직사각형 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int t=0; t<4; t++ ) {
			st = new StringTokenizer(br.readLine());
			int[] square1 = new int[4]; //x(0) y(1) p(2) q(3) 순
			int[] square2 = new int[4]; 
			
			for(int i=0; i<4; i++) {
				square1[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<4; i++) {
				square2[i] = Integer.parseInt(st.nextToken());
			}
			
			//square1의 가로 길이 + square2의 가로길이
			int w = square1[2]-square1[0]+square2[2]-square2[0];
			int h = square1[3]-square1[1]+square2[3]-square2[1];	
			
			//x축 사이 최장거리
				
		
			
			//c, b,d,a순으로 찾아보쟈 .........
			boolean findC1 = (square1[0]==square2[2]&&square1[1]==square2[3]) ||(square1[2]==square2[0]&&square1[3]==square2[1]);
			boolean findC2 = (square1[0]==square2[2]&&square1[3]==square2[1])||(square1[2]==square2[0]&&square1[1]==square2[3]);
			
			
			if(findC1 || findC2) {
				System.out.println("c");
				
			}else if(Math.max(Math.abs(square2[2]-square1[0]),Math.abs(square2[0]-square1[2]))> w || Math.max(Math.abs(square2[3]-square1[1]),Math.abs(square2[1]-square1[3])) >h  ) {
				System.out.println("d");
			}else if(square1[0]==square2[2]||square1[2]==square2[0] || square1[1]==square2[3]||square1[3]==square2[1]) {
				System.out.println("b");
				
			
			}else
				System.out.println("a");
			
		}
		
	}

}
