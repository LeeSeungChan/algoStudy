package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현 / B3
 * 
 * 6378번: 디지털 루트
 * https://www.acmicpc.net/problem/6378
 * 
 * PASS (recursive로 구현하기)
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
			String[] str = String.valueOf(total).split("");
			int[] nrr = new int[str.length];
			for(int i = 0; i < nrr.length; i++) {
				nrr[i] = Integer.parseInt(str[i]);
			}
			
			return findDigitalRoute(nrr);
		}
	}
}
