package baekjoon.implementation.fail;

import java.util.Scanner;

/**
 * 구현,자료구조,스택 / B2
 * 
 * 17608번: 막대기
 * https://www.acmicpc.net/problem/17608
 * 
 * FAIL: 틀렸습니다.
 * 
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
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > last) {
				boolean flag = false;
				
				for(int j = i + 1; j < arr.length - 1; j++) {
					if(arr[i] < arr[j]) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					result++;
				}
			}
		}
		
		// print
		System.out.println(result + 1);
		
		sc.close();
	}
}
