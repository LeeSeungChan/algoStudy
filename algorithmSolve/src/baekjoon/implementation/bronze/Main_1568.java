package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 1568번: 새
 * https://www.acmicpc.net/problem/1568
 * 
 * PASS
 * 없음
 */
public class Main_1568 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int second = 1;
		
		// logic
		while(true) {
			// 새가 0마리이면 break
			if(n < 1) {
				break;
			}
			
			// 1초로 리셋하는 부분
			if(n < second) {
				second = 1;
			}
			
			n = n - second; // 새 감소
			second++; // 초 증가
			result++;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
