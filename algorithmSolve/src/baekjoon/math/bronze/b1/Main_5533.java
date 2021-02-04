package baekjoon.math.bronze.b1;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B1
 * 
 * 5533번: 유니크
 * https://www.acmicpc.net/problem/5533
 * 
 * PASS
 */
public class Main_5533 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] result = new int[n];

		// logic
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int num = arr[i][j];
				
				// 다른 사람의 데이터 비교 (열의 데이터를 비교)
				boolean flag = false;
				for(int k = 0; k < arr.length; k++) {
					int other = arr[k][j];
					
					if(k != i) {
						if(num == other) {
							flag = true;
							break;
						}else {
							continue;
						}
					}
				}
				
				if(!flag) {
					result[i] += num;
				}
			}
		}
		// print
		for (int i : result) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
