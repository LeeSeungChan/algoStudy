package baekjoon.math.bronze.b4;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B4
 * 
 * 15873번: 공백 없는 A+B
 * https://www.acmicpc.net/problem/15873
 * 
 * PASS
 */
public class Main_15873 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		// logic
		if(n == 1010) {
			result = 20;
		}else if(n > 100) {
			if(n % 10 == 0) { // B가 10
				result = n / 100 + 10;
			}else { // A가 10
				result = 10 + n % 10;
			}
		}else {
			result = n / 10 + n % 10;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
