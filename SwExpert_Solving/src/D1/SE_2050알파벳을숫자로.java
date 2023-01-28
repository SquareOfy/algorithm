package D1;

import java.util.Scanner;

public class SE_2050알파벳을숫자로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();
		for (int i=0; i<input.length(); i++) {
			int alph_num = input.charAt(i);
			System.out.print((alph_num - 64)+" ");
		}
		sc.close();
	}
}
//A는 65 //Z는 90
//a는 97
//z는 122		

