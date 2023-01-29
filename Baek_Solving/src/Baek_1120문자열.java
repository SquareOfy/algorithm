import java.util.Scanner;

public class Baek_1120문자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String textA = sc.next();
		String textB = sc.next();
		int len = textB.length();
		
		char[] Barr = new char[len];
		char[] Aarr = new char[len];
		for(int i=0; i<len; i++) {
			Barr[i] = textB.charAt(i);
		}
		int max = 0;
		//가장 많은 문자가 겹칠 때, 몇개의 문자가 겹치는 지 체크
		for(int j=0; j<=len-textA.length(); j++) {
			int cnt =0; //얼마나 많은 문자열이 겹치는지 확인할 cnt
			for(int k=0; k<textA.length(); k++) {
				Aarr[j+k]=textA.charAt(k); //Aarr의 j번째부터 textA 문자 넣기
				if(Aarr[j+k] == Barr[j+k]) {
					cnt += 1;
				}	
			}
			if(cnt>max) {
				max = cnt;
			}
		
		}
		if (max == len) {
			System.out.println(max);
		}else {
			System.out.println(textA.length()-max);
		}
		


	}

}
