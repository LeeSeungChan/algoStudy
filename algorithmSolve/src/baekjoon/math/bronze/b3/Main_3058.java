package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 3058번: 짝수를 찾아라
 * https://www.acmicpc.net/problem/3058
 * 
 * FAIL (런타임에러) - 실수
 * PASS
 */
public class Main_3058 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int[] arr = new int[7];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				
				if(arr[i] % 2 == 0) {
					sum += arr[i];
					
					if(min > arr[i]) {
						min = arr[i];
					}
				}
			}
			
			System.out.println(sum + " " + min);
		}
		
		sc.close();
	}
}
