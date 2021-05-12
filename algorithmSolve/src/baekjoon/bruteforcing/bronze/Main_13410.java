package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / B2
 * 
 * 13410번: 거꾸로 구구단
 * https://www.acmicpc.net/problem/13410
 * 
 * PASS
 */
public class Main_13410 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[k];
		for(int i = 1; i <= k; i++) {
			arr[i - 1] = n * i;
		}
		
		// logic
		arr = reverseArrayElement(arr);
		
		// 최대값 구하기
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// print
		System.out.println(max);
		
		sc.close();
	}

	// 요소 거꾸로 해서 배열 리턴하기
	private static int[] reverseArrayElement(int[] arr) {
 		int[] rArr = new int[arr.length];

 		for(int i = 0; i < arr.length; i++) {
 			String str = String.valueOf(arr[i]);
 			StringBuilder sb = new StringBuilder();
 		
 			// StringBuilder로  거꾸로 뒤집기
 			for(int j = str.length() - 1; j >= 0; j--) {
 				sb.append(str.charAt(j));
 			}
 			
 			rArr[i] = Integer.parseInt(sb.toString());
 		}
 		
 		return rArr;
	}
}
