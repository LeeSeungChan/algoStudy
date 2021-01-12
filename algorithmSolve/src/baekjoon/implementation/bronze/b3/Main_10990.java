package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 10990번: 별 찍기 - 15
 * https://www.acmicpc.net/problem/10990
 * 
 * PASS
 */
public class Main_10990 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// print
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n * 2 - 1)/2 - i; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			if(i == 0) {
				System.out.println();
				continue;
			}
			
			for(int j = 0; j < (i * 2 - 1); j++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
		
		sc.close();
	}
}
