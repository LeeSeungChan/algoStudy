package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / B2
 * 
 * 2231번: 분해합
 * https://www.acmicpc.net/problem/2231
 * 
 * PASS
 */
public class Main_2231 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0; // 생성자
		
		// logic
		for(int i = 1; i <= 1000000; i++) {
			int sub = find(i);
			
			// 탈출문
			if((sub + i) == n) {
				result = i;
				break;
			}
			
			sub = 0;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static int find(int num) { // String 함수 말고 숫자로만 구해보기
		String str = String.valueOf(num);
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			sum += Integer.parseInt(String.valueOf(ch));
		}
		
		return sum;
	}
}
