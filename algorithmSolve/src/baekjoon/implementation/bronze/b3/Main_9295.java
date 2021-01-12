package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 9295번: 주사위
 * https://www.acmicpc.net/problem/9295
 * 
 * PASS
 */
public class Main_9295 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// logic
		for(int i = 1; i <= n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
		
			// print
			System.out.println("Case " + i + ": " + (n1 + n2));
		}
		
		sc.close();
	}
}