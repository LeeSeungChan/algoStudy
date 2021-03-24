package baekjoon.bruteforcing;

import java.util.Scanner;

/**
 * 수학,브루트포스 알고리즘 / B3
 * 
 * 9094번: 수학적 호기심
 * https://www.acmicpc.net/problem/9094
 * 
 * PASS
 */
public class Main_9094 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int result = 0;
			
			for(int i = 1; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					int expression1 = i * i + j * j + m;
					int expression2 = i * j;
					
					if(expression1 % expression2 == 0) {
						result++;
					}
				}
			}
			
			// print
			System.out.println(result);
		}
		
		sc.close();
	}
}
