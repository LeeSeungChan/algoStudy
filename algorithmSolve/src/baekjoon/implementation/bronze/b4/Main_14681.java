package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현,기하학 / B4
 * 
 * 14681번: 사분면 고르기
 * https://www.acmicpc.net/problem/14681
 * 
 * PASS
 */
public class Main_14681 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		
		// logic
		if(x > 0) {
			if(y > 0) {
				result = 1;
			}else {
				result = 4;
			}
		}else {
			if(y > 0) {
				result = 2;
			}else {
				result = 3;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
