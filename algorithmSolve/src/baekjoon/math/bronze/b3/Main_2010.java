package baekjoon.math.bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 2010번: 플러그
 * https://www.acmicpc.net/problem/2010
 * 
 * PASS
 */
public class Main_2010 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		// logic
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(i == 0) {
				result += arr[i];
			}else {
				result += arr[i] - 1;	
			}
		}
		
		// pring
		System.out.println(result);
		
		sc.close();
	}
}
