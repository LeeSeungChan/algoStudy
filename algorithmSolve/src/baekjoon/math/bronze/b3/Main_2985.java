package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,문자열 / B3
 * 
 * 2985번: 세 수
 * https://www.acmicpc.net/problem/2985
 * 
 * 2FAIL
 * PASS
 */
public class Main_2985 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		String result = null;
		boolean flag = false;
		
		// logic
		if(n1 * n2 == n3) {
			result = "*";
			flag = true;
		}else if(n1 / n2 == n3) {
			result = "/";
			flag = true;
		}else if(n1 + n2 == n3) {
			result = "+";
			flag = true;
		}else if(n1 - n2 == n3) {
			result = "-";
			flag = true;
		}else if(n1 == n2 * n3) {
			result = "*";
		}else if(n1 == n2 / n3) {
			result = "/";
		}else if(n1 == n2 + n3) {
			result = "+";
		}else if(n1 == n2 - n3) {
			result = "-";
		}
		
		// print
		if(flag) {
			System.out.println(n1 + result + n2 + "=" + n3);
		}else {
			System.out.println(n1 +  "=" + n2 + result + n3);
		}
		
		sc.close();
	}
}
