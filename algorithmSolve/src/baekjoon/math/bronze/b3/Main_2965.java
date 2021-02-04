package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 2965번: 캥거루 세마리
 * https://www.acmicpc.net/problem/2965
 * 
 * PASS
 */
public class Main_2965 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int len = (b - a > c - b)? b - a : c - b;
		int result = len - 1;
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
