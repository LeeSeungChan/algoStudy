package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B5
 * 
 * 3003번: 킹, 퀸, 룩, 비숍, 나이트, 룩
 * https://www.acmicpc.net/problem/3003
 * 
 * PASS
 */
public class Main_3003 {
	public static void main(String[] args) {
		// initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 1, 2, 2, 2, 8};
		int[] in = new int[arr.length]; 
		int[] result = new int[arr.length];
		
		// input & logic
		for(int i = 0; i < in.length; i++) {
			in[i] = sc.nextInt();
			
			result[i] = arr[i] - in[i];
		}
		
		// print
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
