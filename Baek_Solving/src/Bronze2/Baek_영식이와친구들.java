package Bronze2;

import java.util.Scanner;

public class Baek_영식이와친구들 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] cntArr = new int[N];
		cntArr[0] = 1;
		int idx = 0; // 공을 가지고 있는 사람이 위치한 index
		int cnt = 0;
		while(cntArr[idx] <M) {
		//홀수일 때
		if(cntArr[idx]%2 != 0) {
			cntArr[(idx+L)%N] += 1;
			idx = (idx+L)%N;
			}
		else {
			cntArr[(idx+L)%N] +=1;
			idx = (idx+L)%N;
		}
		cnt ++;
		}
		System.out.println(cnt);
	}

}
