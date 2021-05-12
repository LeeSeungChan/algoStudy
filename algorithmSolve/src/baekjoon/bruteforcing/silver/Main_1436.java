package baekjoon.bruteforcing.silver;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / S5
 * 
 * 1436번: 영화감독 숌
 * https://www.acmicpc.net/problem/1436
 * 
 * PASS
 */
public class Main_1436 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int i = 666;
		
		// logic
		while(true) {
			boolean flag = check(i);
			
			if(flag) {
				result++;
			}
			
			if(n == result) {
				result = i;
				break;
			}else {
				i++;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static boolean check(int i) {
		String str = String.valueOf(i);
		
		if(str.indexOf("666") > -1) {
			return true;
		}else {
			return false;
		}
	}
}
