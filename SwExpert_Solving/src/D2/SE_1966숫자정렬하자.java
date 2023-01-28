package D2;

import java.util.Scanner;

public class SE_1966숫자정렬하자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			//배열에 주어진 숫자 입력하기
			int[] numArr = new int[N];
			for(int i=0; i<N; i++) {
				numArr[i]= sc.nextInt();
			}
			//min을 배열의 맨 끝값으로 초기화
			int min = numArr[N-1];
			
			//i번째에 min을 넣는 for문
			for(int i=0; i<N; i++) {
				//배열 i번째부터 끝까지 돌면서 min구하기(i번째는 앞서 구한 최솟값이 자리하므로 비교하지 않는다)
				//i번째 이후부터 min비교해서 정하는 for문
				for(int j=i; j<N; j++) {
					min = Math.min(min, numArr[j]);
				}
				//구한 min을 index i에 있는 원소와 자리 바꾸기
				for(int j=i; j<N; j++)
					if (min == numArr[j]) {
						numArr[j] = numArr[i];
						numArr[i] = min;
					}
				
					min = numArr[N-1];
					
			}
			
		
			System.out.printf("#%d ",t);
			for(int k=0; k<N; k++) {
				System.out.printf("%d ",numArr[k]);
			}
			System.out.println();
		}
	}
}
	
