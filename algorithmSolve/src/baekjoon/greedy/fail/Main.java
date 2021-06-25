package baekjoon.greedy.fail;

import java.util.Scanner;

/**
 * 그리디 알고리즘 /
 * 
 * n번: 제목
 * https://www.acmicpc.net/problem/n
 * 
 * PASS / FAIL / ING
 */
public class Main {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		
		// logic
		
		//int[][] arr = new int[3][3];
		//printArray2D(arr);
		
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
