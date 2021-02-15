package baekjoon.math.bronze.fail;

import java.util.Scanner;

/**
 * 수학,구현 / B1
 * 
 * 2033번: 반올림
 * https://www.acmicpc.net/problem/2033
 * 
 * FAIL (문제 이해 부족)
 */
public class Main_2033 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n);
		int result = 0;
		
		// logic
		if(n > 10) {
			
		}else {
			result = (n >= 5)? 10 : n;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
