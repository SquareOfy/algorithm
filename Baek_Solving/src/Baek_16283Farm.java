import java.io.IOException;
import java.util.Scanner;

public class Baek_16283Farm {

	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String str = bf.readLine();
//		String arr[] = str.split(" ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int cnt = 0;
		int idx =0;
		int[] answerArr = new int[n-1];
		for(int i=1; i<n; i++) {
			if (i*a + (n-i)*b ==w) {
				cnt ++;
				answerArr[idx++]=i;
			}
		}
		if(cnt==1) {
			System.out.printf("%d %d", answerArr[0], n-answerArr[0]);
		}else 
			System.out.println(-1);
		
	}

}
