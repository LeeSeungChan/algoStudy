package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,구현 / B2
 * 
 * 1551번: 수열의 변화
 * https://www.acmicpc.net/problem/1551
 * 
 * FAIL (틀렸습니다)
 * PASS (recursive 활용하기)
 */
public class Main_1551 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		String str = sc.nextLine();
		String[] srr = str.split(",");
		for(int i = 0; i < srr.length; i++) {
			arr[i] = Integer.parseInt(srr[i]);
		}
		
		repeat(arr, k);
		
		sc.close();
	}

	private static void repeat(int[] arr, int k) {
		if(k == 0) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				
				if(i != arr.length - 1) {
					System.out.print(",");
				}
			}
		}else {
			int[] nrr = new int[arr.length - 1];
			
			for(int i = 0; i < arr.length - 1; i++) {
				nrr[i] = arr[i + 1] - arr[i];
			}
			
			repeat(nrr, k - 1);
		}
	}
}