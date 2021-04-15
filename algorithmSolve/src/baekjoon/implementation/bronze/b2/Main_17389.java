package baekjoon.implementation.bronze.b2;

import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 17389번: 보너스 점수
 * https://www.acmicpc.net/problem/17389
 * 
 * PASS
 */
public class Main_17389 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int result = 0;
		int bonus = 0;
		
		// logic
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = (int) ch;
			
			if(num == 79) {
				result += (i + 1) + bonus;
				bonus++;
			}else {
				bonus = 0;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
