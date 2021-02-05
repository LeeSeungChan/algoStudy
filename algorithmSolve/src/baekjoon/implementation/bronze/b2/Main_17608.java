package baekjoon.implementation.bronze.b2;

import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 17608번: 막대기
 * https://www.acmicpc.net/problem/17608
 * 
 * FAIL (틀렸습니다)
 * PASS
 */
public class Main_17608 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		// logic
		int last = arr[arr.length - 1];
		for(int i = arr.length - 2; i >= 0; i--) {
			if(arr[i] > last) { // 큰 막대기가 있으면 +1하고 last를 큰 막대기로
				result++;
				last = arr[i];
			}
		}
		
		// print
		System.out.println(result + 1); // 마지막 막대기는 무조건 보이기 때문에 +1
		
		sc.close();
	}
}
