package D2;

import java.util.Scanner;

public class SE_1983조교성적매겨 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		//성적 배열에 입력
		String[] gradeArr = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		int scoreK =0 ;
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			// 점수 산출해서 배열에 넣기
			int[] scoreArr = new int[N];
			for(int n=0; n<N; n++) {
				int mid = sc.nextInt();
				int finalScore = sc.nextInt();
				int homework = sc.nextInt();
				scoreArr[n] = mid*35 + finalScore *45 + homework*20;
				if (n == K-1) { // K점수 기억하기
					scoreK = scoreArr[K-1];
				}
			}
			//K보다 높은 점수 카운트
			int cnt = 0; 
			for(int i=0; i<N; i++) {
				if (scoreArr[i] > scoreK) {
					cnt += 1;
				}
			}
			System.out.printf("#%d %S\n",t,gradeArr[cnt/(N/10)]);
			
		}
		

	}

}
