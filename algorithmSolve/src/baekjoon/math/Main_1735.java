package baekjoon.math;

import java.util.Scanner;

/**
 * 수학,정수론,유클리드 호제법 / S2
 * 
 * 1735번: 분수 합
 * https://www.acmicpc.net/problem/1735
 * 
 * FAIL
 */
public class Main_1735 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int r1 = 0;
		int r2 = 0;
		
		int gcd = findGCD(n2, n4);
		
		if(gcd == n2) {
			r1 = n1 + n3 * (gcd / n4);
			r2 = n2;
		}else if(gcd == n4) {
			r1 = n1 * (gcd / n2) + n3;
			r2 = n4;
		}else {
			r1 = n1 * (gcd / n2) + n3 * (gcd / n4);
			r2 = gcd;
		}
		
		// 기약분수로 만들기
		while(r2 % r1 == 0 && r1 != 1) {
			r2 = r2 / r1;
			r1 = r1 / r1;
		}
		
		System.out.println(r1 + " " + r2);
		
		sc.close();
	}

	// 최소공배수 구하기
	private static int findGCD(int n2, int n4) {
		if(n2 > n4) {
			if(n2 % n4 == 0) {
				return n2;
			}
		}else {
			if(n4 % n2 == 0) {
				return n4;
			}
		}
		
 		return n2 * n4;
	}
}
