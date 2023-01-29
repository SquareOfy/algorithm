import java.util.Scanner;

public class Baek_1032명령프롬프트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String t = sc.next();
		int len = t.length();
		char[] titleArr = new char[len];
		for(int j=0; j<len; j++) {
			titleArr[j] = t.charAt(j);
		}
		for (int i=1; i<N; i++) {
			String c = sc.next();
			for(int j=0; j<len; j++) {
				if (titleArr[j] != c.charAt(j)) {
					titleArr[j] = "?".charAt(0);
				}
			}
		}
		for(int j=0; j<len; j++) {
			System.out.print(titleArr[j]);
		}
		
		}

}
