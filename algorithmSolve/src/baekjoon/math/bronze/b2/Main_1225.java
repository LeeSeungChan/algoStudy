package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,구현,문자열 / B2
 * 
 * 1225번: 이상한 곱셈
 * https://www.acmicpc.net/problem/1225
 * 
 * PASS
 */
public class Main_1225 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		long result = 0;
		
		// logic
		for(int i = 0; i < str1.length(); i++) {
			for(int j = 0; j < str2.length(); j++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(j);
				
				result += (Integer.parseInt(String.valueOf(ch1)) * Integer.parseInt(String.valueOf(ch2)));
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
