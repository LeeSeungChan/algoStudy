package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 9085번: 더하기
 * https://www.acmicpc.net/problem/9085
 * 
 * PASS
 */
public class Main_9085 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int total = 0;
			
			for(int i = 0; i < n; i++) {
				total += sc.nextInt();
			}
			
			// print
			System.out.println(total);
		}
		
		sc.close();
	}
}
