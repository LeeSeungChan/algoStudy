package baekjoon.implementation.bronze.b2;

import java.util.Scanner;

/**
 * 구현,문자열 / B2
 * 
 * 1871번: 좋은 자동차 번호판
 * https://www.acmicpc.net/problem/1871
 * 
 * PASS
 */
public class Main_1871 {
	private final static int a = 65;
	private final static int j = 26;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int t = 0; t < n; t++) {
			String result = "not nice";
			String str = sc.nextLine();
			String[] srr = str.split("-");
			String frontStr = srr[0];
			int front = 0;
			int back = Integer.parseInt(srr[1]);
			
			for(int i = 0; i < frontStr.length(); i++) {
				char ch = frontStr.charAt(i);
				int num = ((int) ch) - a;
				
				front += (num * Math.pow(j, 2 - i)); 
			}
			
			int minus = front - back;
			
			if(minus < 100 && minus > -100) {
				result = "nice";
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}
}
