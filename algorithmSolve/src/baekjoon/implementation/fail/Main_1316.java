package baekjoon.implementation.fail;

import java.util.Scanner;

/**
 * 구현,문자열 / S5
 * 
 * 1316번: 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 * 
 * PASS / FAIL / ING
 */
public class Main_1316 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] srr = new String[T];
		for(int t = 0; t < T; t++) {
			srr[t] = sc.nextLine();
		}
		int result = 0;
		
		//logic
		for(int i = 0; i < srr.length; i++) {
			String str = srr[i];
			
			for(int j = 0; j < str.length(); j++) {
				char ch =  str.charAt(j);
				boolean flag = false;
				
				for(int k = j + 1; k < str.length(); k++) {
					
				}
			}
		}
		
		// print
		
		sc.close();
	}
}
