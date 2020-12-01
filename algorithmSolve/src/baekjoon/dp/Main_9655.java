package baekjoon.dp;

import java.util.Scanner;

/**
 * 다이나믹 프로그래밍
 * 
 * 9655번: 돌게임
 * https://www.acmicpc.net/problem/9655
 * 
 * PASS
 */
public class Main_9655 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// logic & print
		// 마지막 가져가는 사람이 이기는 것
		if(n % 2 == 0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
		sc.close();
	}
}
