package baekjoon.dp.bronze;

import java.util.Scanner;

/**
 * DP,수학 / B2
 * 
 * 10870번: 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 * 
 * 2FAIL
 * PASS
 */
public class Main_10870 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// logic & print
		if(n == 0) {
			System.out.println(0);
		}else if(n == 0){
			System.out.println(1);
		}else {
			int[] arr = new int[21];
			arr[0] = 0;
			arr[1] = 1;
			
			for(int i = 2; i < arr.length; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
			
			System.out.println(arr[n]);
		}
		
		sc.close();
	}
}
