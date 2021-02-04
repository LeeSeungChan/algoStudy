package baekjoon.math.bronze.b4;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B4
 * 
 * 10179번: 쿠폰
 * https://www.acmicpc.net/problem/10179
 * 
 * PASS
 * 소수점 구하기
 * 참고: https://coding-factory.tistory.com/250
 */
public class Main_10179 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			double n = sc.nextDouble();
			double result = n * 4 / 5;
			
			// print
			System.out.println("$" + String.format("%.2f", result));
		}
		
		sc.close();
	}
}
