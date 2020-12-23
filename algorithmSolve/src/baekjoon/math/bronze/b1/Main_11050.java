package baekjoon.math.bronze.b1;

import java.util.Scanner;

/**
 * 수학,조합론 / B1
 * 
 * 11050번: 이항계수1
 * https://www.acmicpc.net/problem/11050
 * 
 * PASS
 */
public class Main_11050 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// logic
		int mf = factorial(n);
		int kf1 = factorial(k);
		int kf2 = factorial(n - k);
		
		// print
		System.out.println(mf / (kf1 * kf2));
		
		sc.close();
	}

	// recursive function
	private static int factorial(int n) {
		if(n < 2) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
}
