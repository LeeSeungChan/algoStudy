package baekjoon.math.fail;

import java.util.Scanner;

/**
 * 수학,구현 / B1
 * 
 * 2033번: 반올림
 * https://www.acmicpc.net/problem/2033
 * 
 * FAIL (문제 이해 부족)
 */
public class Main_2033 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		
		// logic
		String s0 = String.valueOf(str.charAt(0));
		String s1 = String.valueOf(str.charAt(1));

		if(Integer.parseInt(s1) >= 5) { // 반올림
			sb.append(Integer.parseInt(s0) + 1);
			sb.append(0);
		}else {
			sb.append(str.subSequence(0, 2));
		}
		
		if(str.length() > 2) {
			sb.append(str.substring(2));	
		}
		
		// print
		System.out.println(Integer.parseInt(sb.toString()));
		
		sc.close();
	}
}
