package baekjoon.greedy.silver.s5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 그리디 알고리즘, 정렬 / S3
 * 
 * 11399번: ATM
 * https://www.acmicpc.net/problem/11399
 * 
 * FAIL (틀렸습니다)
 * PASS (맞았습니다)
 */
public class Main_11399 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int[] brr = new int[n];
		int result = 0;

		// logic
		Arrays.sort(arr);

		brr[0] = arr[0];
		for(int i = 1; i < arr.length; i++){
			brr[i] = brr[i - 1] + arr[i];

			result += brr[i];
		}

		// print
		System.out.println(result + arr[0]);

		sc.close();
	}
}
