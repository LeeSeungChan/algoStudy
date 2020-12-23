package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 10101번: 삼각형 외우기
 * https://www.acmicpc.net/problem/10101
 * 
 * PASS
 * 없음
 */
public class Main_10101 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = null;
		
		// logic
		if((a + b + c) != 180) {
			result = "Error";
		}else if(a == 60 && b == 60 && c == 60) {
			result = "Equilateral";
		}else if(a != b && b!= c && c!= a) {
			result = "Scalene";
		}else {
			result = "Isosceles";
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
