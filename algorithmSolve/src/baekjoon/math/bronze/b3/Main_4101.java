package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 4101번: 크냐?
 * https://www.acmicpc.net/problem/4101
 * 
 * FAIL (틀렸습니다) - 실수
 * PASS
 */
public class Main_4101 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		
		// logic
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a > b) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}
