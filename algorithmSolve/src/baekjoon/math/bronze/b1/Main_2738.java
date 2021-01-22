package baekjoon.math.bronze.b1;

import java.util.Scanner;

/**
 * 수학,구현 / B1
 * 
 * 2738번: 행렬 덧셈
 * https://www.acmicpc.net/problem/2738
 * 
 * PASS (랭크가 너무 높다)
 */
public class Main_2738 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] brr = new int[n][m];
		int[][] result = new int[n][m];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		// logic
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[i][j] + brr[i][j];
			}
		}
		
		//int[][] arr = new int[3][3];
		printArray2D(result);
		
		// print
		
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
