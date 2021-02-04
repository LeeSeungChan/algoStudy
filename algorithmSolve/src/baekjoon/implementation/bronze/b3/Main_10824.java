package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 10824번: 네 수
 * https://www.acmicpc.net/problem/10824
 * 
 * FAIL (런타임에러)
 * PASS
 */
public class Main_10824 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		// logic
		StringBuilder sb1 = new StringBuilder(String.valueOf(a));
		sb1.append(String.valueOf(b));
		
		StringBuilder sb2 = new StringBuilder(String.valueOf(c));
		sb2.append(String.valueOf(d));
		
		// print
		System.out.println(Long.parseLong(sb1.toString()) + Long.parseLong(sb2.toString()));
		
		sc.close();
	}
}
