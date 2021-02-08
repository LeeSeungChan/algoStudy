package baekjoon.implementation.fail;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 구현,자료구조,시뮬레이션,큐 / S3
 * 
 * 1966번: 프린터 큐
 * https://www.acmicpc.net/problem/1966
 * 
 * ING
 */
public class Main_1966 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			Queue<Integer> que = new ArrayDeque<Integer>();
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				que.add(arr[i]);
			}
			
			if(n == 1) {
				System.out.println(1);
			}else {
				
			}
		}
		
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
