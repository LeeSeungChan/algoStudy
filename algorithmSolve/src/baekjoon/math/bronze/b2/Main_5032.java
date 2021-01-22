package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B2
 * 
 * 5032번: 탄산 음료
 * https://www.acmicpc.net/problem/5032
 * 
 * PASS
 */
public class Main_5032 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		e = e + f;
		
		// logic
		while(true) {
			int sub = e / c;
			e = e - (sub * c) + sub;
			result += sub;

			if(e < c) {
				break;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
