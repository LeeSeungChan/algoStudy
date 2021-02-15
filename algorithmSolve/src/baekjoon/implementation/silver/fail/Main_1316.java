package baekjoon.implementation.silver.fail;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

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
			Set<String> set = new HashSet<String>();
			boolean flag = false;
			
			for(int j = 0; j < str.length(); j++) {
				char ch =  str.charAt(j);
				boolean hasFlag = false;
				
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
