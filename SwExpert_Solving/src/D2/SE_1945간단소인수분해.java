package D2;

import java.util.Scanner;

public class SE_1945간단소인수분해 {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j=0; j<T; j++) {
            int[] primeNums = {2,3,5,7,11};
            int N = sc.nextInt();
             
            int[] degreeNum = new int [5];
            for(int i=0; i<5; i++) {
                while(N%primeNums[i] == 0) {
                    degreeNum[i] += 1;
                    N = N / primeNums[i];
                }
     
            }
            System.out.print("#"+(j+1)+" ");
            for(int k=0; k<5;k++) {
                System.out.print(degreeNum[k]+" ");
            }
                System.out.println();
             
        }
         
    }
 
}

