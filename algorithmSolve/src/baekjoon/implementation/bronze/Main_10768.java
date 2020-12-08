package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 10768번: 특별한 날
 * https://www.acmicpc.net/problem/10768
 * 
 * PASS
 */
public class Main_10768 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// logic & print
		if(m < 2 ) {
			System.out.println("Before");
		}else if(m > 2) {
			System.out.println("After");
		}else {
			if(n < 18) {
				System.out.println("Before");
			}else if(n > 18) {
				System.out.println("After");
			}else {
				System.out.println("Special");
			}
		}
		
		sc.close();
	}
}
