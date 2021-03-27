package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학 / B2
 * 
 * 2399번: 거리의 합
 * https://www.acmicpc.net/problem/2399
 * 
 * PASS / FAIL / ING
 */
public class Main_2339 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		long result = 0;
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}else {
					if(arr[i] > arr[j]) {
						result += (arr[i] - arr[j]);
					}else {
						result += (arr[j] - arr[i]);
					}
				}
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
