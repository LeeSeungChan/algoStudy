package baekjoon.greedy.bronze.b3;

import java.util.Scanner;

/**
 * 그리디 알고리즘 / B3
 * 
 * 2730번: 세탁소 사장 동혁
 * https://www.acmicpc.net/problem/2730
 * 
 * PASS
 */
public class Main_2730 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int c = sc.nextInt();
			int q = 0; // 25센트
			int d = 0; // 10센트
			int n = 0; // 5센트
			int p = 0; // 1센트
			
			if(c >= 25) {
				q = c / 25;
				c = c % 25;
			}
			if(c >= 10) {
				d = c / 10;
				c = c % 10;
			}
			if(c >= 5) {
				n = c / 5;
				c = c % 5;
			}
			if(c >= 1) {
				p = c / 1;
			}
			
			// print
			System.out.println(q + " " + d + " " + n + " " + p);
		}
		
		sc.close();
	}
}
