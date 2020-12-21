package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현,문자열 / B2
 * 
 * 1100번: 하얀 칸
 * https://www.acmicpc.net/problem/1100
 * 
 * PASS
 * 입력 부분 확인
 */
public class Main_1100 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int LEN = 8;
		String[][] srr = new String[LEN][LEN];
		for(int i = 0; i < srr.length; i++) {
			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				srr[i][j] = String.valueOf(str.charAt(j));
			}
		}
		int result = 0;
		
		// logic
		for(int i = 0; i < srr.length; i++) {
			int strIdx = 0;
			
			if(i % 2 != 0) {
				strIdx = 1;
			}
			
			for(int j = strIdx; j < srr[i].length; j += 2) {
				if("F".equals(srr[i][j])) {
					result++;
				}
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
