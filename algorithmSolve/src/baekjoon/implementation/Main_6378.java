package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 6378번: 디지털 루트
 * https://www.acmicpc.net/problem/6378
 * 
 * PASS / FAIL / ING
 */
public class Main_6378 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// logic
		while(true) {
			// input
			String s = sc.nextLine();
			
			if("0".equals(s)) {
				break;
			}
			
			String[] str = s.split("");
			int[] arr = new int[str.length];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			
			int result = findDigitalRoute(arr);
			
			// print
			System.out.println(result);
		}
		
		sc.close();
	}

	private static int findDigitalRoute(int[] arr) {
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		if(total < 10) {
			return total;
		}else {
			
		}
		
 		return 0;
	}
}
