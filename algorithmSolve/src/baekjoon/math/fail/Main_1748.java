package baekjoon.math.fail;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / S3
 * 
 * 1748번: 수 이어 쓰기 1
 * https://www.acmicpc.net/problem/1748
 * 
 * 2 FAIL (메모리 초과 - 0.15초)
 */
public class Main_1748 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int result = 0;
		
		// logic
		for(int i = 1; i <= n; i++) {
			//sb.append(i);
			result += String.valueOf(i).length();
		}
		
		if(n < 10) {
			result = n;
		}else {
			
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
