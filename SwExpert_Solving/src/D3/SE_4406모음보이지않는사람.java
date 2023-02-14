package D3;

import java.util.Scanner;

public class SE_4406모음보이지않는사람 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String word = sc.next();
			for(int j=0; j<5; j++) {
				word = word.replaceAll(vowels[j], "");

			}
			System.out.printf("#%d %s \n", t, word);
		}

	}

}
