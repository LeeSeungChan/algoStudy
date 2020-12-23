package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B3
 * 
 * 11006번: 남욱이의 닭장
 * https://www.acmicpc.net/problem/11006
 * 
 * PASS
 */
public class Main_11006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++){
			int n = sc.nextInt(); // 닭 다리 합
			int m = sc.nextInt(); // 닭 수
			
			int result1 = m * 2 - n;
			int result2 = m - result1;
			
			System.out.println(result1 + " " + result2);
		}
		
		sc.close();
	}

}
