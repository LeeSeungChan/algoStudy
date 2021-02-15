package baekjoon.implementation.bronze.b1;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 9455번: 박스
 * https://www.acmicpc.net/problem/9455
 * 
 * PASS
 */
public class Main_9455 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[m][n];
			int result = 0;
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// logic
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					int sub = arr[i][j];
					
					// 요소가 1이면
					if(sub == 1) {
						// 방법1 : 자기 밑의 이동거리에서 1인 개수를 빼면 본인의 실제 이동 거리
						int len = m - i - 1;
						int minus = 0;
						
						for(int k = i + 1; k < m; k++) {
							if(arr[k][j] == 1) {
								minus++;
							}
						}
						
						result += (len - minus);
						
						// 방법2 : 자기보다 밑에 있는 요소중 0의 개수가 본인의 실제 이동 거리
						/*for(int k = i + 1; k < m; k++) {
							if(arr[k][j] == 0) {
								result++;
							}
						}*/
					}
				}
			}
			
			// print
			System.out.println(result);
		}
		
		sc.close();
	}
}
