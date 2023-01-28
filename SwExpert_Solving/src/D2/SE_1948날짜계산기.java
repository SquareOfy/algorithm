package D2;

import java.util.HashMap;
import java.util.Scanner;

public class SE_1948날짜계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//HashMap에 1월부터 12월까지 일 수 저장하기
		HashMap<Integer, Integer> mdMatch = new HashMap<Integer, Integer>();
		mdMatch.put(1, 31);
		mdMatch.put(2, 28);
		mdMatch.put(3, 31);
		mdMatch.put(4, 30);
		mdMatch.put(5, 31);
		mdMatch.put(6, 30);
		mdMatch.put(7, 31);
		mdMatch.put(8, 31);
		mdMatch.put(9, 30);
		mdMatch.put(10, 31);
		mdMatch.put(11, 30);
		mdMatch.put(12, 31);
		
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int m1 = sc.nextInt(); int d1=sc.nextInt();
			int m2 = sc.nextInt(); int d2=sc.nextInt();
			int output = 0;
			
			//입력된 두 달이 일치할 경우 일의 차이+1만 계산
			if(m1==m2) {
				output = d2-d1+1;
			
			//나중 월의 숫자가 더 클 경우, 
			}else if(m1<m2) {
				output += mdMatch.get(m1)-d1+1+d2; //첫달의 남은 일수 + 마지막 달의 일수
				for(int i=1; i<m2-m1; i++) { //첫 달과 마지막 달 사이의 날짜
					output += mdMatch.get(m1+i);
				}
			// 나중 월의 숫자가 더 작을 경우, 해가 바뀌었다는 의미.
			}else if(m1>m2) {
				output += mdMatch.get(m1)-d1+1+d2;//첫 달의 남은 일수 + 마지막 달의 일수
				for(int i=1; i<12+m2-m1;i++) {
					output+= mdMatch.get(i%12);
				}
			}
			System.out.printf("#%d %d",t,output);
			System.out.println();
		}
	}

}
