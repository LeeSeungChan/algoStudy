package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B4
 * 
 * 2420번: 사파리 월드
 * https://www.acmicpc.net/problem/2420
 * 
 * 2FAIL
 * PASS
 */
public class Main_2420 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long result = n - m;
		
		// logic
		if(result < 0) {
			result = result * -1;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
