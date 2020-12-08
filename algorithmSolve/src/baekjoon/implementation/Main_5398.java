package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현
 * 
 * 5398번: 17배
 * https://www.acmicpc.net/problem/5398
 * 
 * FAIL
 */
public class Main_5398 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long n =  Integer.parseInt(str, 2);
		n = n * 17;
		StringBuilder result = new StringBuilder();
		
		// logic: 정수를 2진수로 바꾸기
		while(true) {
			long r = n % 2;
			
			if(n == 1) {
				result.insert(0, 1);
				break;
			}
			
			n = n / 2;
			result.insert(0, r);
		}
		
		// print
		System.out.println(result.toString());
		
		sc.close();
	}
}
