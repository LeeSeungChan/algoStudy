package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B2
 * 
 * 9546번: 3000번 버스
 * https://www.acmicpc.net/problem/9546
 * 
 * PASS
 */
public class Main_9546 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 1; t <= T; t++) {
			int k = sc.nextInt();
			int result = 0;
			
			// 역순으로 풀어가기
			for(int i = 1; i <= k; i++) {
				if(i == 1) {
					result += 1;
				}else {
					result = result * 2 + 1;
				}
			}
			
			// print
			System.out.println(result);
		}
		
		sc.close();
	}
}
