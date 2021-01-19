package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B2
 * 
 * 2864번: 5와 6의 차이
 * https://www.acmicpc.net/problem/2864
 * 
 * PASS (다른 방법 가능)
 */
public class Main_2864 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		int max = 0;
		
		// logic
		min = setMinValue(a, '6', '5') + setMinValue(b, '6', '5');
		max = setMinValue(a, '5', '6') + setMinValue(b, '5', '6');
		
		// print
		System.out.println(min + " " + max);
		
		sc.close();
	}

	// 최소 값 구할 때는 6 -> 5로 치환
	// 최대 값 구할 때는 5 -> 6로 치환
	private static int setMinValue(int num, char before, char after) {
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == before) {
				ch = after;
			}
			
			sb.append(ch);
		}
		
		return Integer.parseInt(sb.toString());
	}
}
