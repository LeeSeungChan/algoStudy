package baekjoon.implementation.bronze.b1;

import java.util.Scanner;

/**
 * 구현,문자열 / B1
 * 
 * 1357번: 뒤집힌 덧셈
 * https://www.acmicpc.net/problem/1357
 * 
 * 2 FAIL
 * PASS
 */
public class Main_1357 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 1<=x<=100
		int y = sc.nextInt(); // 1<=y<=100
		int result = 0;
		
		// logic
		int xRev = rev(x);
		int yRev = rev(y);
		result = rev(xRev + yRev);
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static int rev(int n) {
		String str = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		int rVal = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			sb.append(ch);
		}
		rVal = Integer.parseInt(sb.toString());
		
		return rVal;
	}
}
