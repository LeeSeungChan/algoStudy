package baekjoon.bruteforcing.silver;

import java.util.Scanner;

/**
 * 구현,브루트포스 알고리즘 / S5
 * 
 * 7568번: 덩치
 * https://www.acmicpc.net/problem/7568
 * 
 * PASS
 */
public class Main_7568 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] result = new int[n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			int k = 0;
			
			int weight = arr[i][0];
			int height = arr[i][1];
			
			for(int j = 0; j < arr.length; j++) {
				if(i != j) {
					// 자신보다 덩치가 큰 사람 개수 구하기
					if(weight < arr[j][0] && height < arr[j][1]) {
						k++;
					}
				}
			}
			
			result[i] = (k + 1);
		}

		// print
		for (int i : result) {
			System.out.print(i + " ");
		}
		
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
