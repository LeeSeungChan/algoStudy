package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 10872번: 팩토리얼
 * https://www.acmicpc.net/problem/10872
 * 
 * PASS
 */
public class Main_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = factorial(n);
		
		System.out.println(result);
		
		sc.close();
	}

	private static int factorial(int n) {
		if(n == 0 || n == 1){
			return 1;
		}else{
			return n * factorial(n - 1);
		}
	}
}
