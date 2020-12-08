package baekjoon.math;

import java.util.Scanner;

/**
 * 수학 / B2
 * 
 * 2869번: 달팽이는 올라가고 싶다
 * https://www.acmicpc.net/problem/2869
 * 
 * 2FAIL : 시간초과
 */
public class Main_2869 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		// b < a <= v <= 100000000
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int result = 0;
		
		// logic
		// 0.15 이내 실행
		/*if(a == v) {
			result = 1;
		}else {
			if(v - a < a) {
				result = 2;
			}else {
				int n1 = (v - a) / (a - b);
				result = n1 + 1;
			}
		}*/
		
		// print
		System.out.println(v - a + b);
		
		sc.close();
	}
}
