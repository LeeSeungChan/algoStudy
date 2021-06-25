package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 수학, 브루트포스, 사칙연산 / B3
 * 
 * 6131번: 완전 제곱수
 * https://www.acmicpc.net/problem/6131
 * 
 * PASS
 */
public class Main_6131 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		// logic
		for(int b = 1; b <= 500; b++){
			for(int a = 1; a <= 500; a++){
				if((a * a) == ((b * b) + n)){
					result++;
				}
			}
		}

		// print
		System.out.println(result);
		
		sc.close();
	}
}
