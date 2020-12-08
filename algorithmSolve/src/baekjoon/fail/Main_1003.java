package baekjoon.fail;

import java.util.Scanner;

/**
 * DP / S3
 * 
 * 1003번: 피보나치함수
 * https://www.acmicpc.net/problem/피보나치 함수
 * 
 * ING
 */
public class Main_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			System.out.println(n);
		}
		
		sc.close();
	}
	
	private static int fibonacci(int n){
		if (n == 0) {
	        System.out.println("0");
	        return 0;
	    } else if (n == 1) {
	        System.out.println("1");
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}

}