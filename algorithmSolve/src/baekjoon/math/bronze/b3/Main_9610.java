package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 9610번: 사붐면
 * https://www.acmicpc.net/problem/9610
 * 
 * PASS (B4 정도)
 */
public class Main_9610 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[5];
		
		// logic
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == 0 || y == 0) {
				arr[0]++;
			}else if(x > 0 && y > 0){ // 1사분면
				arr[1]++;
			}else if(x < 0 && y > 0){ // 2사분면
				arr[2]++;
			}else if(x < 0 && y < 0){ // 3사분면
				arr[3]++;
			}else { // 4사분면
				arr[4]++;
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println("Q" + i + ": " + arr[i]);
		}
		System.out.println("AXIS: " + arr[0]);
		
		sc.close();
	}
}
