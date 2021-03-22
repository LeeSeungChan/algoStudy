package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 15718번: 헬멧과 도끼
 * https://www.acmicpc.net/problem/15718
 * 
 * PASS
 */
public class Main_15781 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		int m = sc.nextInt();
		long[] brr = new long[m];
		
		// logic
		long max = Long.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		long max2 = Long.MIN_VALUE;
		for(int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
			
			if(max2 < brr[i]) {
				max2 = brr[i];
			}
		}
		
		// print
		System.out.println(max + max2);
		
		sc.close();
	}
}
