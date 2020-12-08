package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,문자열,사칙연산,파싱 / B2
 * 
 * 10953번: A + B - 6
 * https://www.acmicpc.net/problem/10953
 * 
 * PASS
 */
public class Main_10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int t = 0; t < T; t++){
			String s = sc.nextLine();
			String[] str = s.split(",");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.println(a + b);
		}
		
		sc.close();
	}

}
