package D1;

public class SE_2027대각선출력 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if (i==j) {
					System.out.print("#");
				}else System.out.print("+");
			}
			System.out.println();
		}
	}
	
}
