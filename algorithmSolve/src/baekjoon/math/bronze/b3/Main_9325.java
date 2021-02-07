package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 9325번: 얼마?
 * https://www.acmicpc.net/problem/9325
 * 
 * PASS
 */
public class Main_9325 {
	public static void main(String[] args) {
		// input & initialize & logic
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int q = sc.nextInt();
				int p = sc.nextInt();
				
				s += (q * p);
			}
			
			// print
			System.out.println(s);
		}
		
		sc.close();
	}
}
