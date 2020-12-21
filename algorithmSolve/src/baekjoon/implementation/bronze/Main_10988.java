package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현,문자열 / B1
 * 
 * 10988번: 팰린드롬인지 확인하기
 * https://www.acmicpc.net/problem/10988
 * 
 * PASS
 */
public class Main_10988 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = false;
		
		// logic
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				flag = true;
				break;
			}
		}
		
		// print
		if(flag) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
		
		sc.close();
	}
}
