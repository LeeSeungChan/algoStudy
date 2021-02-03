package baekjoon.implementation.silver.s5;

import java.util.Scanner;

/**
 * 구현,시뮬레이션 / S5
 * 
 * 2947번: 나무 조각
 * https://www.acmicpc.net/problem/2947
 * 
 * PASS
 */
public class Main_2947 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int LEN = 5;
		int[] arr = new int[LEN];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int idx = 0;
		
		// logic
		while(true) {
			boolean breakFlag = check(arr);
			if(!breakFlag) {
				break;
			}
			
			if(arr[idx] > arr[idx + 1]) {
				swap(arr, idx);
			}
			
			if(idx >= 3) {
				idx = 0;
			}else {
				idx++;
			}
		}
		
		sc.close();
	}

	private static void swap(int[] arr, int index) {
		for(int i = 0; i < arr.length; i++) {
			if(i == index) {
				int temp = arr[index];
				arr[i] = arr[index + 1];
				arr[i + 1] = temp;
				i = i + 1;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// 5. 항목 function
	private static boolean check(int[] arr) {
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != (i + 1)) {
				flag = true;
				break;
			}
		}
		
		// true면 탈출불가
		return flag;
	}
}
