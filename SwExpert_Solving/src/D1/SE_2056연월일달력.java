package D1;

import java.util.Scanner;

public class SE_2056연월일달력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			//날짜인 숫자 입력 받기
			String input = sc.next();
			
			//연, 월, 일 문자열로 구분짓기
			String y = input.substring(0,4);
			String m = input.substring(4,6);
			String d = input.substring(6);
			//연,월,일 정수화 시키기
			int yyyy = Integer.parseInt(y);
			int mm = Integer.parseInt(m);
			int dd = Integer.parseInt(d);
			//월별 일이 맞는지 확인하고 출력하기
			switch(mm) {
			case 01: case 03: case 05: case 07: case 8: case 10: case 12:
				if (dd<=31) System.out.println("#"+(i+1)+" "+y+"/"+m+"/"+d);
				else System.out.println("#"+(i+1)+" -1");
				break;
			case 02:
				if (dd<=28) System.out.println("#"+(i+1)+" "+y+"/"+m+"/"+d);
				else System.out.println("#"+(i+1)+" -1");
				break;
			case 04: case 06: case 9: case 11:
				if (dd <= 30) System.out.println("#"+(i+1)+" "+y+"/"+m+"/"+d);
				else System.out.println("#"+(i+1)+" -1");
				break;
			default:
				System.out.println("#"+(i+1)+" -1");
			}
		}
		
	}

}
