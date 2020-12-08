package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현
 * 
 * 1009번: 분산처리
 * https://www.acmicpc.net/problem/1009
 * 
 * PASS / FAIL / ING
 */
public class Main_1009 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		//int T = sc.nextInt();
		
		// logic
		/*for(int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			long n = (long) Math.pow(a, b);
			long result = (n % 10 == 0)? 10 : n % 10;
			System.out.println(result);
		}*/
		
		// print
		
		for(int i = 1; i < 10; i++) {
			int n = (int) Math.pow(7, i);
			System.out.println(n % 10);
		}
		
		sc.close();
	}
}
