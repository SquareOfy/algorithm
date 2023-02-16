package Silver4;

import java.util.Scanner;

public class Baek_1158요세푸스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] table = new boolean[N];
		int cnt = K - 1;
		int[] order = new int[table.length];
		int idx =0;
		int close = 0;
		boolean flag = true;
		while (flag) {
			if (table[cnt] == false) {
				System.out.println(cnt);
				table[cnt] = true;
				order[idx++] = (cnt+1);
				cnt = (cnt + K) % N;
			} else {
				cnt = (cnt+1)%N;
			}
			for (int i = 0; i < table.length; i++) {
				if (table[i] == true) {
					close += 1;
				}
			}
			if (close == table.length) {
				flag = false;
			}
		}
		for(int j=0; j<order.length; j++) {
			System.out.print(order[j]);
		}

	}

}
