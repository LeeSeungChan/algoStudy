package baekjoon.implementation.fail;

import java.util.Scanner;

/**
 * 구현,문자열 / B1
 * 
 * 1357번: 뒤집힌 덧셈
 * https://www.acmicpc.net/problem/1357
 * 
 * FAIL
 */
public class Main_1357 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
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
		
		
		return 0;
	}
}
