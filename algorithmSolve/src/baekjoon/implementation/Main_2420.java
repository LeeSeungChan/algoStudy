package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현
 * 
 * 2420번: 사파리 월드
 * https://www.acmicpc.net/problem/2420
 * 
 * PASS / FAIL / ING
 */
public class Main_2420 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
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
