package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 10950번: A + B - 3
 * https://www.acmicpc.net/problem/10950
 * 
 * PASS
 */
public class Main_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
		
		sc.close();
	}

}
