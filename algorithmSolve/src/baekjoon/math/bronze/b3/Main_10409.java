package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 10409번: 서버
 * https://www.acmicpc.net/problem/10409
 * 
 * PASS
 */
public class Main_10409 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int t = sc.nextInt();
		int sum = 0;
		int result = 0;
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			if(t >= sum + arr[i]) {
				sum += arr[i];
				result++;
			}else {
				break;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
