package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 문자열,브루트포스 알고리즘 / B2
 * 
 * 2386번: 도비의 영어 공부
 * https://www.acmicpc.net/problem/2386
 * 
 * FAIL (틀렸습니다 - 출력문 오타)
 * PASS
 */
public class Main_2386 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		
		// logic
		while(true){
			String check = sc.next();
			if("#".equals(check)) {
				break;
			}
			
			String str = sc.nextLine().trim();
			int count = 0;
			
			for(int i = 0; i < str.length(); i++) {
				String ch = String.valueOf(str.charAt(i)).toLowerCase();
				
				if(ch.equals(check)) {
					count++;
				}
			}
			
			// print
			System.out.println(check + " " + count);
		}
		
		sc.close();
	}
}
