package baekjoon.math.bronze.fail;

import java.util.Scanner;

/**
 * 분류
 * 
 * 1592번: 제목
 * https://www.acmicpc.net/problem/1592
 * 
 * PASS / FAIL / ING
 */
public class Main_1592 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int m = sc.nextInt();
		int l = sc.nextInt();
		int result = 0;
		
		// logic
		while(true) {
			
			
			
			if(checkBreak(arr, l)) {
				break;
			}
			
			result++;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static boolean checkBreak(int[] arr, int l) {
		boolean flag = false;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == l) {
				flag = true;
				break;
			}
		}
		
 		return flag;
	}

}
