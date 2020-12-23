package baekjoon.math.silver.s4;

import java.util.Scanner;

/**
 * 수학,정수론,소수 판정,에라토스테네스의 체 / S4
 * 
 * 1978번: 소수 찾기
 * https://www.acmicpc.net/problem/1978
 * 
 * PASS
 */
public class Main_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		int result = countPrimeNumber(arr);
		
		System.out.println(result);
		
		sc.close();
	}

	private static int countPrimeNumber(int[] arr) {
		int result = 0;
		
		for(int i = 0; i < arr.length; i++){
			int n = arr[i];
			int d = 1;
			int subCount = 0;
			
			for(int j = 1; j <= n; j++){
				if(n % d == 0){
					subCount++;
				}
				d++;
			}
			
			if(subCount == 2){
				result++;
			}
		}
		
 		return result;
	}
}
