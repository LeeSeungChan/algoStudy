package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학 / B2
 * 
 * 1773번: 폴죽쇼
 * https://www.acmicpc.net/problem/1773
 * 
 * PASS
 */
public class Main_1773 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		int[] time = new int[c + 1];
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			int r = arr[i];
			
			for(int j = 1; r * j < time.length; j++) {
				if(time[r * j] == 0) {
					time[r * j] = 1;
				}
			}
		}
		
		for(int i = 0; i < time.length; i++) {
			if(time[i] == 1) {
				result++;
			}
			
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
