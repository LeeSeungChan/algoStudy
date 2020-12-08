package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 10950번: A + B - 3
 * https://www.acmicpc.net/problem/10950
 * 
 * PASS
 */
public class Main_10951 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			// print
			System.out.println(a + b);
		}
		
		sc.close();
	}

}
