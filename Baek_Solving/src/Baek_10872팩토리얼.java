import java.util.Scanner;

public class Baek_10872팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = N;
		int factorial=1;
		if(N==0) { 
		}else {
			for(int i=0; i<N; i++) {
				factorial *= num;
				num -= 1;
				
			}
			
		}
		System.out.println(factorial);

	}

}
