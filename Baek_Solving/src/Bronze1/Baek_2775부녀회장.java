package Bronze1;

import java.util.Scanner;

public class Baek_2775부녀회장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t =0; t<T; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			int[] numArr = new int[n+1];
			//0층 세팅
			for(int i=1; i<=n; i++) {
				numArr[i] += i;
			}
			//1층부터 k층까지 각각 사람 을 배열에 다시 넣는다구요!
			for(int i=1; i<=k; i++) {
				for(int j=1; j<=n; j++ ) {
					numArr[j]= numArr[j]+numArr[j-1];
				}
			}
			System.out.println(numArr[n]);
			
		
			
		}
		
		
	}

}
//for(int i=1; i<=k; i++) {
//for(int j=n; j>0; j-- ) {
//	sum =0;
//	sum+= numArr[j];
//	numArr[j] = sum;
//}
//}
//System.out.println(numArr[k]);