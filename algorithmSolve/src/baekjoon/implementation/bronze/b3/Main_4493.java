package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 4493번: 가위 바위 보?
 * https://www.acmicpc.net/problem/4493
 * 
 * PASS
 */
public class Main_4493 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			sc.nextLine();
			int cnt1 = 0;
			int cnt2 = 0;
			
			for(int i = 0; i < n; i ++) {
				String p1 = sc.next();
				String p2 = sc.next();
				
				if(("S".equals(p1) && "P".equals(p2)) || ("R".equals(p1) && "S".equals(p2)) || ("P".equals(p1) && "R".equals(p2))) {
					cnt1++;
				}
				
				if(("S".equals(p2) && "P".equals(p1)) || ("R".equals(p2) && "S".equals(p1)) || ("P".equals(p2) && "R".equals(p1))) {
					cnt2++;
				}
			}
			
			if(cnt1 > cnt2) {
				System.out.println("Player 1");
			}else if(cnt1 < cnt2) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}
		
		sc.close();
	}
}

// 가위 바위 보
// S R P
// S > P
// R > S
// P > R
