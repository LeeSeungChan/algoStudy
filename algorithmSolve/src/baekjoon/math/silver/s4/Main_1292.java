package baekjoon.math.silver.s4;

import java.util.Scanner;

/**
 * 수학 / S4
 * 
 * 1292번: 쉽게 푸는 문제
 * https://www.acmicpc.net/problem/1292
 * 
 * FAIL (틀렸습니다)
 * PASS
 */
public class Main_1292 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		int[] arr = new int[1000];
		int count = 1;
		
		// logic
		for(int i = 0; i < arr.length - 1; ) {
			int until = i + count;

			for(int j = i; j < until; j++) {
				if(j >= 1000) { // 없으면 ArrayIndexOutOfBoundsException
					break;
				}
				
				arr[j] = count; 
			}
			
			i += count; // 배열 index 중가
			count++;
		}
		
		/// 합 구하기
		for(int i = a - 1; i < b; i++) {
			result += arr[i];
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
