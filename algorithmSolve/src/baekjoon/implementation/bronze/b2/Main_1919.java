package baekjoon.implementation.bronze.b2;

import java.util.Scanner;

/**
 * 구현,문자열 / B2
 * 
 * 1919번: 에너그램
 * https://www.acmicpc.net/problem/1919
 * 
 * PASS
 */
public class Main_1919 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		char[] str1 = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();
		int result = 0;
		int cnt = 0;
		
		// logic
		for(int i = 0; i < str1.length; i++) {
			char ch = str1[i];
			
			for(int j = 0; j < str2.length; j++) {
				if(ch == str2[j]) {
					cnt++;
					str2[j] = ' ';
					break;
				}
			}
		}
		
		result = (str1.length - cnt) + (str2.length - cnt);
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
