package baekjoon.math.silver.s5;

import java.util.Scanner;

/**
 * 수학,그리디 알고리즘 / S5
 * 
 * 4796번: 캠핑
 * https://www.acmicpc.net/problem/4796
 * 
 * PASS (B2 정도)
 */
public class Main_4796 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int index = 1;
		
		// logic
		while(true) {
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			int result = 0;
			
			if(l == 0 && p == 0 && v == 0) {
				break;
			}
			
			result += l * (v / p); // 몫 계산
			
			int re = v % p; // 나머지를 더하기
			if(re <= l) {
				result += re;
			}else {
				result += l; 
			}
			
			// print
			System.out.println("Case " + index++ + ": " + result);
		}
		
		sc.close();
	}
}
