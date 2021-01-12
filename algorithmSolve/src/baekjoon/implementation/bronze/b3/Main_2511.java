package baekjoon.implementation.bronze.b3;

import java.util.Scanner;

/**
 * 구현 / B3
 * 
 * 2511번: 카드놀이
 * https://www.acmicpc.net/problem/2511
 * 
 * FAIL
 * PASS
 * 더 간결하게 풀 수 있는 방법이 있을까?
 */
public class Main_2511 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		final int LEN = 10;
		int[] arr = new int[LEN];
		int[] brr = new int[LEN];
		String[] wrr = new String[LEN];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		int aSum = 0;
		int bSum = 0;
		String result = null;
		
		// logic
		for(int i = 0; i < LEN; i++) {
			if(arr[i] > brr[i]) {
				aSum += 3;
				wrr[i] = "A";
			}else if(arr[i] < brr[i]) {
				bSum += 3;
				wrr[i] = "B";
			}else {
				aSum += 1;
				bSum += 1;
				wrr[i] = "D";
			}
		}
		
		if(aSum != bSum) {
			result = (aSum > bSum)? "A" : "B";
		}else {
			boolean drawFlag = false;
			
			for(int i = wrr.length - 1; i >= 0; i--) {
				if(!"D".equals(wrr[i])) {
					drawFlag = true;
					result = wrr[i];
					break;
				}
			}
			
			if(!drawFlag) {
				result = "D";
			}
		}
		
		// print
		System.out.println(aSum + " " + bSum);
		System.out.println(result);	
		
		sc.close();
	}
}
