import java.util.Scanner;

public class Baek_2309일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		int sum = 0;
		for(int i =0; i<9; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}
		
		outer : for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-height[i]-height[j]==100) {
					height[i] = 0;
					height[j] = 0;
					break outer;
				}
			}	
		}
		int min = 100;
		int idx = 0;

		for(int i=0; i<9; i++) {
			for(int j=i; j<9; j++) {
				if (height[j]!=0) {
					if(min >= height[j]) {
						min = height[j];
						idx = j;
					}
				}
			}
			int a = height[i];
			height[i] = height[idx];
			height[idx] = a;
			
			if(height[i]!=0) {
			System.out.println(height[i]);
			}
			min = 100;

		}
		sc.close();
	
	}

}
