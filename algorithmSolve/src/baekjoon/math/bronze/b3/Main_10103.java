package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 10103번: 주사위 게임
 * https://www.acmicpc.net/problem/10103
 * 
 * PASS
 */
public class Main_10103 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 100;
		int b = 100;
		
		// logic
		for(int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n1 > n2) {
				// 창영 승
				b -= n1;
			}else if(n1 < n2) {
				// 상덕 승
				a -= n2;
			}else {
				// nothing
			}
		}
		
		// print
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}
}
