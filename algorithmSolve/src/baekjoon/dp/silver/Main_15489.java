package baekjoon.dp.silver;

import java.util.Scanner;

/**
 * DP / B1
 * 
 * 15489번: 파스칼 삼각형
 * https://www.acmicpc.net/problem/15489
 * 
 * PASS
 * 다시 풀어보기
 */
public class Main_15489 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();
		int n = r + w - 1;
		int result = 0;
		int[][] arr = new int[n][];
		// DP 배열 만들기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == i) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		
		// test print
		/*for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}*/
		
		// logic
		int idx = 1;
		for(int i = (r - 1); i < (r - 1 + w); i++) {
			for(int j = c - 1; j < (c - 1 + idx); j++) { // j + idx 대신 (c - 1) + idx 사용, j는 가변적인 값이므로
				int sub = arr[i][j];
				result += sub;
			}
			
			idx++;
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
