package baekjoon.implementation.silver.s5;

import java.util.Scanner;

/**
 * 구현,브루트포스 알고리즘 / S5
 * 
 * 14912번: 숫자 빈도 수
 * https://www.acmicpc.net/problem/14912
 * 
 * FAIL (실수)
 * PASS 
 */
public class Main_14912 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int result = 0;
		
		// logic
		for(int i = 1; i <= n; i++) {
			String str = String.valueOf(i);
			
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if(Integer.parseInt(String.valueOf(ch)) == d) {
					result++;
				}
			}
			
		}

		// print
		System.out.println(result);
		
		sc.close();
	}
}
