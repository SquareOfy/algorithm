package D1;

import java.util.Scanner;

public class SE_1936가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A+B == 4) {
			if (A>B) {
				System.out.println("B");
			}
				else {
					System.out.println("A");
			}
		}
		
		else if (A>B) {
			System.out.println("A");
		}
		
		else {
			System.out.println("B");
		}
		
		sc.close();
	}
	
}
