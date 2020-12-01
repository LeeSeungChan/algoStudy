package baekjoon.dp;

import java.util.Scanner;

/**
 * 다이나믹 프로그래밍
 * 
 * 13301번: 타일 장식몰
 * https://www.acmicpc.net/problem/13301
 * 
 * PASS
 */
public class Main_13301 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 0;
		
		// logic
		if(n == 1) { // DP인 경우 1번째, 2번째 항목은 분리해서 처리해야함 
			result = 4;
		}else if(n == 2) {
			result = 6;
		}else {
			long[] arr = new long[n + 1]; // 정수형 단위를 넘어가는지 항상 확인
			arr[1] = 4;
			arr[2] = 6;
			
			/*
			// case1
			for(int i = 3; i < arr.length; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}*/

			// case2: 규칙 찾아서 풀어보기
			long[] brr = new long[n + 1];
			brr[1] = 1;
			brr[2] = 1;
			for(int i = 3; i < brr.length; i++) {
				brr[i] = brr[i - 1] + brr[i - 2];
			}
			
			for(int i = 3; i < arr.length; i++) {
				arr[i] = arr[i - 1] + (brr[i] * 3) - brr[i]; 
			}
			
			result = arr[arr.length - 1];
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

}
