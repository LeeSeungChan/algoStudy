package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B2
 * 
 * 5988번: 홀수일까 짝수일까
 * https://www.acmicpc.net/problem/5988
 * 
 * PASS
 */
public class Main_5988 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		// logic
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine(); // 숫자 is 10^60
			
			char ch = str.charAt(str.length() - 1);
			int last = Integer.parseInt(String.valueOf(ch));
			
			// print
			if(last % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
		
		sc.close();
	}
}
