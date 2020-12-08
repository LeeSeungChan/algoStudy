package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 15963번: CASIO
 * https://www.acmicpc.net/problem/15963
 * 
 * PASS
 */
public class Main_15963 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		// 변수 길이 체크
		// nextInt -> nextLong
		
		// logic & print
		if(n == m) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		sc.close();
	}
}