import java.util.Scanner;

public class Baek_2475검증수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int squareSum =0;
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
			squareSum += a*a;
		}
		int result = squareSum %= 10;	
		System.out.println(result);
	}

}
