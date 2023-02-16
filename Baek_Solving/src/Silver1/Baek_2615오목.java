package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2615오목 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] place = new int[29][29];

		for (int r = 5; r < 24; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 5; c < 24; c++) {
				place[r][c] = Integer.parseInt(st.nextToken());
			}
		}
//		System.out.println(Arrays.toString(place[2]));
//		System.out.println(Arrays.toString(checkWin(place, 1)));
//		System.out.println(Arrays.toString(checkWin(place, 2)));
		if(checkWin(place, 1)[1] !=0) {
			System.out.println(checkWin(place, 1)[0]);
		
			System.out.println(checkWin(place, 1)[1]+" "+checkWin(place, 1)[2]);
			
		}else if(checkWin(place,2)[1]!=0) {
			System.out.println(checkWin(place,2)[0]);
			System.out.println(checkWin(place, 2)[1]+" "+checkWin(place, 2)[2]);
		}else System.out.println(0);
	}

	static int[] checkWin(int[][] place, int num) {
		int[] dr = { -1, 0, 1, 0, -1, -1, 1, 1 }; // 상, 0, 하, 0, 좌상, 좌하, 우상, 우하
		int[] dc = { 0, -1, 0, 1, -1, 1, -1, 1 };
		int cnt = 0;
	
		int[] result = new int[3];
		for (int r = 5; r < 24; r++) {
			for (int c = 5; c < 24; c++) {
				for (int i = 0; i < 8; i++) {
					cnt = 1;
					int[] wArr = new int [5];
					int widx =0;
					int[] hArr = new int [5];
					int hidx = 0;
					if (place[r][c] == num  ) {
						int nr = r ;
						int nc = c ;
						if (place[nr][nc] == num) {
							while (place[nr][nc] == num && cnt < 5) {
								// num가 나온 방향으로 더 가기!
								wArr[widx++] = nr;
								hArr[hidx++] = nc;
								nr += dr[i];
								nc += dc[i];
								cnt++;

//							 다섯개가 되긴 했는데 뒤에 또 o인 경우는 그냥 break
								if (cnt == 5 && place[r-dr[i]][c-dc[i]] != num && place[nr + dr[i]][nc + dc[i]] != num) {
									//아래로 갈때, 오른쪽으로 갈때, 오른쪽 아래, 오른쪽 위로 갈때,
									if(i==2 || i==3 || i==6 || i==7) {
										result[1]= wArr[0]-4;
										result[2] = hArr[0]-4;
									}else {
										result[1] = wArr[4]-4;
										result[2] = hArr[4]-4;
									}
									result[0]=num;
									
									return result;
								}
							}
						}
					}
				}
			}
		
		}
		return result;
	}

}
