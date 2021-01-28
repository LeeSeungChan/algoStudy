package baekjoon.math.bronze.b1;

import java.util.Scanner;

/**
 * 수학 / B1
 * 
 * 1526번: 가장 큰 금민수
 * https://www.acmicpc.net/problem/1526
 * 
 * PASS (다른 방법은?)
 *  각 자리 숫자를 %10하여 나머지로 비교
 */
public class Main_1526 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// logic
		while(true) {
			boolean flag = false;
			
			String str = String.valueOf(n);
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); // Integer.toString(i);
				
				if(ch == '4' || ch == '7') {
					continue;
				}else {
					flag = true;
				}
			}
			
			if(!flag) {
				// print
				System.out.println(n);
				break;
			}
			
			n = n - 1;
		}
		
		sc.close();
	}
}
