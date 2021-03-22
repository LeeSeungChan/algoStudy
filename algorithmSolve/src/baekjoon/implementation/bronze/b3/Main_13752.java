package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 13752번: 히스토그램
 * https://www.acmicpc.net/problem/n
 * 
 * PASS
 */
public class Main_13752 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// logic
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0; j < num; j++) {
				sb.append("=");
			}
			
			System.out.println(sb.toString());
		}
		
		sc.close();
	}
}
