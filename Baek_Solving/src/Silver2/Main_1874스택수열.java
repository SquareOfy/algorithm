package Silver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Main_1874스택수열 {
	//아이디어 : 입력된 숫자(a) 이후로 나온 수들 중 a보다 작은 수들이 오름차순이 되는 순간이 한번이라도 존재하면 no
	// no인지 판단 후 no가 아니면~

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
		
		for(int i=0; i<N; i++ ) {
			seq[i] = Integer.parseInt(br.readLine());
		}
		//수열로 배치가 가능할지 판단하는 메서드로 판단 가능하면 rFlag = false
		boolean rFlag = true;
		for(int i=0; i<N; i++) {
			if(!checkSeq(seq, i)) rFlag = false;
			}
		//수열로 배치 불가할때 출력	
		if(!rFlag) {
			System.out.println("NO");
		}else {
			//스택에 1부터 오름차순으로 된 수를 입력하는데
			Stack<Integer> stack = new Stack<>();
			int n =1;
			for(int i=0; i<N; i++) {
				//스택이 비어있거나 스택의 맨 위 값이 입력값 수열에서 현재 보고 있는 값보다 작으면 push
				while((stack.isEmpty() || stack.peek()<seq[i] )&&n<N ) {
					stack.push(n++);
					sb.append("+\n");
				}
				//스택의 맨 위값이 입력값 수열에서 현재 보고 있는 값과 같으면 pop
				while(!(stack.isEmpty())&&stack.peek()==seq[i] && n<=N) {
					
					stack.pop();
					sb.append("-\n");				
				}
				
				//입력값 수열에서 내가 지금 보고 있는 값(seq[i])가 가장 큰 값이면 push를 먼저 한 후,
				//스택에 있는 값 모두 꺼내기
				if(seq[i]==N) {
					stack.push(seq[i]);
					sb.append("+\n");
					while(!stack.isEmpty()) {
						stack.pop();
						sb.append("-\n");
						
					}
				}
			}
			
			
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		}
		
	}

	
	static boolean checkSeq(int[] seq, int i) {
		boolean flag = false;
		int term = 0;
		if(seq[i]==1) {
			return true;
		}
		else {
			for(int j = i+1; j<seq.length; j++) {
				if(seq[j]<seq[i] && flag == false) {
					flag = true;
					term = seq[j];
				}
				if(flag == true && seq[j]<seq[i]) {
					if(term<seq[j]) return false;
				}
			}
		}
		return true;
	}

}
