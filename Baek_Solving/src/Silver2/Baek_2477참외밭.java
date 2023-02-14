package Silver2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek_2477참외밭 {

	public static void main(String[] args) {
		//방법 : 큰 직사각형의 넓이 - 작은 직사각형의 넓이
		//동서 중 긴 길이, 남북 중 긴 길이가 각각 넓은 직사각형의 가로,세로
		
		//작은 직사각형 가로세로 길이 구하기
		//앞 뒤로 위치한 방향을 의미하는 숫자가 같으면 그 길이기 작은 직사각형의 변의 길이
	
		
		Scanner sc = new Scanner(System.in);
		
		//참외의개수 : 면적에다 곱할 예정
		int N = sc.nextInt();
		
		int[] direction = new int[6];
		int[] len = new int[6];
		
		for(int i=0; i<6; i++) {
			direction[i] = sc.nextInt();
			len[i] = sc.nextInt();
		}
		//큰 사각형의 가로 세로 구하는 과정
		int[] width = new int[3];
		int[] height = new int[3];
		int widthIdx = 0;
		int heightIdx = 0;
		int smallW = 0;
		int smallH = 0;
		for(int i=0; i<6; i++) {
			//동서
			if(direction[i] == 1 || direction[i]==2) {
				width[widthIdx] = len[i];
				widthIdx ++;
				if((i!=0 && i!=5)&& (direction[i-1]==direction[i+1]) ) {
					smallW = len[i];
				}else if(i==0 && direction[5]==direction[i+1]) {
					smallW = len[i];
				}else if(i==5 && direction[0]==direction[i-1]) {
					smallW = len[i];
				}
			}else {
				height[heightIdx] = len[i];
				heightIdx ++;
				if((i!=0 && i!=5) && (direction[i-1]==direction[i+1]) ) {
					smallH = len[i];
				}else if(i==0 && direction[5]==direction[i+1]) {
					smallH = len[i];
				}else if(i==5 && direction[0]==direction[i-1]) {
					smallH = len[i];
				}
			}
		}
		int maxWidth =0;
		int maxHeight = 0;
		for(int i=0; i<3; i++) {
			if(width[i]>maxWidth) {
				maxWidth = width[i];
				
			}
			if(height[i]>maxHeight) {
				maxHeight = height[i];
			}
		}
		
		System.out.println(N*((maxHeight*maxWidth)-(smallW*smallH)));
		
		//작은 사각형의 가로세로는?
		
	}

}
