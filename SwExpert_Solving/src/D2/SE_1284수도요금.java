package D2;

import java.util.Scanner;

public class SE_1284수도요금 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	         
	        int T = sc.nextInt();
	         
	        for(int i =1; i<=T; i++) {
	            int P= sc.nextInt(); //A사 1리터당 금액
	            int Q= sc.nextInt(); //B사 기본금액
	            int R= sc.nextInt(); //B사 기본금액 상한선
	            int S= sc.nextInt(); //B사 초과량의 리터당 금액
	            int W =sc.nextInt(); //한달간 수도 사용량
	            int aWater = P*W;
	            int bWater;
	            if (W<=R) {
	                bWater = Q;
	            }else {
	                bWater = Q + (W-R)*S;
	            }
	             
	             
	             
	            System.out.println("#"+i+" "+Math.min(aWater, bWater));
	        }
	         
	    }//main괄호 닫기
	 
	} //class 괄호 닫기
