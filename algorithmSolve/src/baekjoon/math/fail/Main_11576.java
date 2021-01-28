package baekjoon.math.fail;

import java.util.Scanner;

/**
 * 수학,구현,정수론 / S5
 * 
 * 11576번: Base Conversion
 * https://www.acmicpc.net/problem/n
 * 
 * 2 FAIL
 */
public class Main_11576 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int num = 0;
		
		// logic
		int index = 0;
		// a진수를 10진수로 변환
		for(int i = arr.length - 1; i >= 0; i--) {
			num += arr[i] * (int) Math.pow(a, index++);
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 10진수의 값을 b진수로 변환
		while(true) {
			int r = num % b;
			sb.insert(0, r);
			int g = num / b;
			
			if(g < b) {
				sb.insert(0, g);
				break;
			}else {
				num = g;
			}
			
			break;
		}
		
		// print
		String str = sb.toString();
		for(int i = 0; i < sb.toString().length(); i++) {
			System.out.print(str.charAt(i));
			
			if(i != sb.toString().length() - 1) {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
