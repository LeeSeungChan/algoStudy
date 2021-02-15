package baekjoon.math.silver.s5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 수학,문자열,정렬,정수론 / S5
 * 
 * 10610번: 30
 * https://www.acmicpc.net/problem/10610
 * 
 * PASS
 */
public class Main_10610 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // sc.nextLine().toCharArray();
		boolean flag = false;
		char[] arr = new char[str.length()];
		int sum = 0;
		
		// logic
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[i] = ch;
			
			if(ch == '0') {
				flag = true;
			}
			
			sum += Integer.parseInt(String.valueOf(ch));
		}
		
		if(flag) {
			if(sum % 3 == 0) {
				// 가장 큰 수 구하기
				Arrays.sort(arr);
				StringBuilder sb = new StringBuilder();
				
				for(int i = arr.length - 1; i >= 0; i--) {
					sb.append(arr[i]);
				}
				
				// Collections.sort(numbers, Collections.reverseOrder());
				
				System.out.println(sb.toString());
			}else {
				System.out.println(-1);
			}
		}else {
			// 0이 없으면 만들 수 없음
			System.out.println(-1);
		}
		
		sc.close();
	}
}
