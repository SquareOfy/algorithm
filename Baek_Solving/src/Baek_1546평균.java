import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_1546평균 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String Num = br.readLine();
		int N = Integer.parseInt(Num);
		
		String[] scoreArr;
		
		scoreArr = (br.readLine().split(" "));
		int[] scoreInt = new int[N];
		int max =0;
		for(int i=0; i<N; i++) {
			scoreInt[i] =Integer.parseInt(scoreArr[i]); 
			if(max<scoreInt[i]) {
				max=scoreInt[i];
			}
		}
		
		double mean = 0;
		for(int i=0; i<N; i++) {
			mean += (scoreInt[i]/(double)max)*100.0;
			
		}
		String result = Double.toString(mean/N);
		bw.write(result);
		bw.flush();
		bw.close();
		
	}

}
