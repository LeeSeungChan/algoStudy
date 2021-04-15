package baekjoon.implementation.bronze.b2;

import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 2562번: 최댓값
 * https://www.acmicpc.net/problem/2562
 * 
 * PASS (B4정도..)
 */
public class Main_2562 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		int max = Integer.MIN_VALUE;		
		// logic
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				result = (i + 1);
			}
		}
		
		// print
		System.out.println(max);
		System.out.println(result);
		
		sc.close();
	}
}
