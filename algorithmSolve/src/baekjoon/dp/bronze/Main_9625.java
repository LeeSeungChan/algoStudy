package baekjoon.dp.bronze;

import java.util.Scanner;

/**
 * DP / B1
 * 
 * 9625번: BABBA
 * https://www.acmicpc.net/problem/9625
 * 
 * PASS
 */
public class Main_9625 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int[k + 1];
		int[] brr = new int[k + 1];
		arr[0] = 0;
		brr[0] = 1;
		
		// logic
		for(int i = 1; i <= k; i++) {
			if(i == 1) {
				arr[i] = 1;
				brr[i] = 1;
			}else {
				arr[i] = arr[i - 1] + arr[i - 2];
				brr[i] = brr[i - 1] + brr[i - 2];
			}
		}
		
		// print
		System.out.println(arr[k - 1] + " " + brr[k - 1]);
		
		sc.close();
	}

}
