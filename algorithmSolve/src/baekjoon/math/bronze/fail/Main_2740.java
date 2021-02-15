package baekjoon.math.bronze.fail;

import java.util.Scanner;

/**
 * 수학 / B1
 * 
 * 2740번: 행렬 곱셈
 * https://www.acmicpc.net/problem/2740
 * 
 * ING
 */
public class Main_2740 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		int[][] brr = new int[m2][k];
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		int[][] result = new int[n][k];
		
		// logic
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				
			}
		}
		
		// print
		printArray2D(result);
		
		sc.close();
	}

	// 2차원 배열 print 함수
	private static void printArray2D(int[][] arr) {
 		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
