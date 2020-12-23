package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 11948번: 과목선택
 * https://www.acmicpc.net/problem/11948
 * 
 * PASS
 * 없음
 */
public class Main_11948 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		// logic
		int min1 = arr[0];
		for(int i = 1; i < 4; i++) {
			if(min1 > arr[i]) {
				min1 = arr[i];
			}
		}
		
		int min2 = (arr[4] > arr[5])? arr[5] : arr[4];
			
		// print
		System.out.println(total - min1 - min2);
		
		sc.close();
	}
}
