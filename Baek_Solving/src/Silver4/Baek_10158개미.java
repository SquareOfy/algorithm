package Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek_10158개미 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt(); int h = sc.nextInt();
		int p = sc.nextInt(); int q = sc.nextInt();
		int t = sc.nextInt();
		
		
		//방향벡터 , 오른쪽 위 대각 또는 왼쪽 위 대각 또는 왼쪽 아래 대각 또는 오른쪽 위 순
		//오른쪽 위로 가다가 벽에 닿으면 왼쪽 위. 천장에 닿으면 오른쪽 아래.  
		//왼쪽 위로 가다가 벽에 닾으면 오른쪽 위. 천장에 닿으면 왼쪽 아래.
		//왼쪽 아래로 가다가 벽에 닿으면 오른쪽 아래 ,바닥에 닿으면 왼쪽 위
		//오른쪽 아래로 가다가 벽에 닿으면 왼쪽 아래, 바닥에 닿으면 오른쪽 위
		
		//규칙 : 벽에 닿으면 좌우 방향(c)이 바뀌고 바닥 또는 천장에 닿으면 위 아래 방향이 바뀐다(r)
		//처음엔 오른쪽 위로 출발
		int dr = 1;
		int dc = 1; 
		
		while(t>0) {
			//벽 또는 바닥에 닿았을 때
			if(q+dr>h|| q+dr<0) {
				dr *= -1;
			}
			if(p+dc>w || p+dr<0){
				dc *= -1;
			}
			p += dc;
			q += dr;
			t--;
		}
		
		System.out.println(p+" "+q);
		

	}

}
