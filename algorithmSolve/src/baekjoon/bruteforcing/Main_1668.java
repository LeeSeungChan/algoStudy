package baekjoon.bruteforcing;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / B2
 * 
 * 1668번: 트로피 진열
 * https://www.acmicpc.net/problem/1668
 * 
 * FAIL (틀렸습니다)
 * PASS (로직 오류)
 */
public class Main_1668 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1<= N <=50
		int[] arr1 = new int[n];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[arr1.length - i - 1];
		}
		int result1 = 0;
		int result2 = 0;
		
		// logic
		result1 = checkState(arr1);
		result2 = checkState(arr2);
		
		// print
		System.out.println(result1);
		System.out.println(result2);
		
		sc.close();
	}

	private static int checkState(int[] arr) {
		int count = 1;
		
		for(int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			boolean flag = false;
			
			for(int j = 0; j < i; j++) {
				if(cur <= arr[j]) { // 크거나 같으면 카운트 증가하면 안된다
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				count++;
			}
		}
		
 		return count;
	}
}
