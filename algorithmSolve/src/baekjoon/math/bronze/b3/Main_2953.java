package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 2953번: 나는 요리사다
 * https://www.acmicpc.net/problem/2953
 * 
 * PASS (input / part-1 / part-2 반복문을 1개의 반복문으로 가능)
 */
public class Main_2953 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] sum = new int[arr.length];
		
		// logic
		// part-1. 각 요리사의 점수 합 구하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		
		// part-2. 점수 합 중 최다 점수 구하기
		int max = sum[0];
		int index = 0;
		for(int i = 1; i < sum.length; i++) {
			if(max < sum[i]) {
				max = sum[i];
				index = i;
			}
		}
		
		// print
		System.out.println((index + 1) + " " + sum[index]);
		
		sc.close();
	}
}
