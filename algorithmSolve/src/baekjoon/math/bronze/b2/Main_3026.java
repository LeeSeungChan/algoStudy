package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B2
 * 
 * 3062번: 수 뒤집기
 * https://www.acmicpc.net/problem/3062
 * 
 * PAS
 */
public class Main_3026 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int r = reverse(n);
			
			boolean flag = check(n + r);
			
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}

	// 정수 뒤집기
	private static int reverse(int n) {
		String str = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i --) {
			sb.append(str.charAt(i));
		}
		
 		return Integer.parseInt(sb.toString());
	}

	// 좌우 대칭인지 확인
	private static boolean check(int num) {
		boolean flag = false;
		
		String str = String.valueOf(num);
		
		for(int i = 0; i < str.length() / 2; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(str.length() - i - 1);
			
			if(ch1 != ch2){
				flag = true;
				break;
			}
		}
		
		if(flag) {
			return false;
		}else {
			return true;
		}
	}
}
