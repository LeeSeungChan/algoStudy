package baekjoon.bruteforcing.fail;

import java.util.Scanner;

/**
 * 구현,브루트포스 알고리즘 / B3
 * 
 * 4690번: 완전 세제곱
 * https://www.acmicpc.net/problem/4690
 * 
 * ING
 */
public class Main_4690 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		
		// logic
		for(int a = 0; a <= 100; a++) {
			for(int b = 1; b <= 100; b++) {
				for(int c = 1; c <= 100; c++) {
					for(int d = 1; d <= 100; d++) {
						if(a*a*a == ((b*b*b) + (c*c*c) + (d*d*d))) {
							System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
						}
					}
				}
			}
		}
		
		// print
		
		sc.close();
	}
}
