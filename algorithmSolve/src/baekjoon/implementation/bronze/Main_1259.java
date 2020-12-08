package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현,문자열 / B1
 * 
 * 1259번: 펠림드론수
 * https://www.acmicpc.net/problem/1259
 * 
 * PASS
 */
public class Main_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// input & initialize
			String str = String.valueOf(sc.nextInt());
			int[] arr = new int[str.length()];
			boolean flag = false;
			
			if(Integer.parseInt(str) == 0){
				break;
			}
			
			for(int i = 0; i < str.length(); i++) {
				arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			
			// logic
			for(int i = 0; i < arr.length / 2; i++) {
				if(arr[i] != arr[arr.length - 1 - i]) {
					flag = true;
					break;
				}
			}
			
			// print
			if(flag) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}
		
		sc.close();
	}
}
