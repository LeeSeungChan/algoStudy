package baekjoon.math.silver.s5;

import java.util.Scanner;

/**
 * 수학,조합론 / S5
 * 
 * 16395번: 파스칼의 삼각형
 * https://www.acmicpc.net/problem/16395
 * 
 * PASS
 */
public class Main_16395 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[n][];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		
		// logic
		//printArray2D(arr);
		
		// print
		System.out.println(arr[n - 1][k - 1]);
		
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
