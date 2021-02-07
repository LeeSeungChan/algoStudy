package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 1712번: 손익분기점
 * https://www.acmicpc.net/problem/1712
 * 
 * FAIL (틀렸습니다)
 * PASS
 */
public class Main_1712 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		
		// logic
		if(c - b <= 0) {
			result = -1;
		}else {
			while(true) {
				if(a < (c - b) * result){
					break;
				}
				
				result++;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
