package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 2576번: 홀수
 * https://www.acmicpc.net/problem/2576
 * 
 * 2 FAIL (실수 조심)
 * PASS
 */
public class Main_2576 {
	public static void main(String[] args) {
		// initialize
		Scanner sc = new Scanner(System.in);
		int LEN = 7;
		int[] arr = new int[LEN];
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		// input & logic
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] % 2 != 0) {
				sum += arr[i];
				
				if(min > arr[i]) {
					min = arr[i];
				}
			}else {
				
			}
		}
		
		if(min == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();
	}
}
