import java.util.Scanner;

public class Baek_5566주사위게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] instructions = new int[N];
		//지시사항 배열에 입력하기
		for(int i=0; i<N; i++) {
			instructions[i] = sc.nextInt();
		}
		
		//시작지점 1
		int move = 1; //현재 위치
		int cnt = 0; //주사위 던진 횟수
		for(int j=0; j<M; j++) {
			//주사위 던져 나온 눈의 수
			int diceNum = sc.nextInt();
			//주사위 던진 횟수 추가
			cnt += 1;
			//주사위 눈의 수만큼 이동
			move += diceNum;
			
			//N넘으면 도착이므로 break
			if (move>=N) {
				break;
			}
			//주사위를 던져 이동한 위치의 수만큼 이동(배열이므로 -1)
			move += instructions[move-1];
			if (move<0) {
				move =1;
			}else if (move>=N) {
				break;
			}

		}
		System.out.println(cnt);
	}

}
