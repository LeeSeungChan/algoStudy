package baekjoon.math.bronze.b1;

import java.util.Scanner;

/**
 * 수학,구현,문자열,사칙연산 / B1
 * 
 * 1356번: 유진수
 * https://www.acmicpc.net/problem/1356
 * 
 * PASS
 */
public class Main_1356 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "NO";
		String str = String.valueOf(n);
		
		// logic
		for(int i = 1; i <= str.length() - 1; i++) {
			// substring으로 각 부분이 한자리는 있도록 처리
			String a = str.substring(0, i);
			String b = str.substring(i);

			int aNum = calculate(a);
			int bNum = calculate(b);
			
			if(aNum == bNum) {
				result = "YES";
				break;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static int calculate(String str) {
		int sum = 1;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			sum *= Integer.parseInt(String.valueOf(ch));
		}
		
 		return sum;
	}
}
