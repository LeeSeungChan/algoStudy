package baekjoon.math;

import java.util.Scanner;

/**
 * 수학
 * 
 * 2588번: 곱셈
 * https://www.acmicpc.net/problem/2588
 * 
 * PASS
 */
public class Main_2588 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] result = new int[4];
		result[3] = n1 * n2;
		int m = 10;
		
		// logic
		for(int i = 0; i < 3; i++) {
			int r = n2 % m;
			
			result[i] = n1 * r;
			
			n2 = n2 / 10;
		}
		
		// print
		for (int i : result) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
