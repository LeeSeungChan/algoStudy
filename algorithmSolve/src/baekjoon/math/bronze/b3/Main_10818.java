package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현
 * 
 * 10818번: 최소, 최대
 * https://www.acmicpc.net/problem/10818
 * 
 * PASS / FAIL / ING
 */
public class Main_10818 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// logic
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		
		System.out.println(minValue + " " + maxValue);
		
		sc.close();
	}
}
