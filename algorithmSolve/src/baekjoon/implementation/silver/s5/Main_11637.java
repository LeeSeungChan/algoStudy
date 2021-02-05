package baekjoon.implementation.silver.s5;

import java.util.Scanner;

/**
 * 구현 / S5
 * 
 * 11637번: 인기 투표
 * https://www.acmicpc.net/problem/11637
 * 
 * 2 FAIL
 * PASS (과반수의 의미를 알자)
 */
public class Main_11637 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int index = 0;
			int max = Integer.MIN_VALUE;
			int sum = 0;
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
				
				if(arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == max) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println("no winner");
			}else if(max > sum / 2) {
				System.out.println("majority winner " + (index + 1));
			}else {
				System.out.println("minority winner " + (index + 1));
			}
		}
		
		sc.close();
	}
}
