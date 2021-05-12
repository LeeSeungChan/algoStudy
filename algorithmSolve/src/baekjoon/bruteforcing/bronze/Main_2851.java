package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 2851번: 슈퍼 마리오
 * https://www.acmicpc.net/problem/2851
 * 
 * PASS
 */
public class Main_2851 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = arr[0];
		
		// logic
		for(int i = 1; i < arr.length; i++) {
			int n1 = Math.abs(result - 100);
			int n2 = Math.abs(result + arr[i] - 100);
			
			if(n1 < n2) {
				break;
			}else if(n1 >= n2) {
				result += arr[i];
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
