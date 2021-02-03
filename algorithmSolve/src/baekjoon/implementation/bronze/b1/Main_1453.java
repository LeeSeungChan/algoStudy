package baekjoon.implementation.bronze.b1;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 1453번: 피시방 알바
 * https://www.acmicpc.net/problem/1453
 * 
 * FAIL
 * PASS (B3 정도)
 */
public class Main_1453 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		int count = 0;
		
		// logic
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(arr[num - 1] == 0) {
				count++;
			}else {
				arr[num - 1] = 0;
			}
		}
		
		// print
		System.out.println(count);
		
		sc.close();
	}
}
