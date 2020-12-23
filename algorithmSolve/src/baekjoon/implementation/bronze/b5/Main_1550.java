package baekjoon.implementation.bronze.b5;

import java.util.Scanner;

/**
 * 구현 / B5
 * 
 * 1550번: 16진수
 * https://www.acmicpc.net/problem/1550
 * 
 * PASS
 */
public class Main_1550 {
	// 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = 0;
		
		// logic
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length() - 1 - i);
			int m = 1;
			
			// 자리수에 곱해야하는 16 제곱수 구하기
			for(int j = 0; j < i; j++) {
				m = m * 16;
			}
			
			if(ch == 'A') {
				result += m * 10;
			}else if(ch == 'B') {
				result += m * 11;
			}else if(ch == 'C') {
				result += m * 12;
			}else if(ch == 'D') {
				result += m * 13;
			}else if(ch == 'E') {
				result += m * 14;
			}else if(ch == 'F') {
				result += m * 15;
			}else {
				result += m * Integer.parseInt(String.valueOf(ch));
			}
		}
		//result = Integer.parseInt(str, 16);
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
