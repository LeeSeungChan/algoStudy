package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학 / B4
 * 
 * 3004번: 체스판 조각
 * https://www.acmicpc.net/problem/3004
 * 
 * PASS
 */
public class Main_3004 {
	public static void main(String[] args) {
		// initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		// input & logic
		if(n % 2 == 0) {
			result = (n / 2 + 1) * (n / 2 + 1);
		}else {
			result = ((n + 1) / 2 + 1) * (n / 2 + 1);
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
