package baekjoon.math.bronze.b2;

import java.util.Scanner;

/**
 * 수학,구현 / B2
 * 
 * 1551번: 수열의 변화
 * https://www.acmicpc.net/problem/1551
 * 
 * FAIL
 */
public class Main_1551 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[k + 1][];
		arr[0] = new int[n];
		String str = sc.nextLine();
		String[] srr = str.split(",");
		for(int i = 0; i < srr.length; i++) {
			arr[0][i] = Integer.parseInt(srr[i]);
		}
		StringBuilder sb = new StringBuilder();
		
		// logic
		if(k == 0) {
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[0][i]);
				
				if(i != arr.length - 1) {
					sb.append(",");
				}
			}
		}else {
			for(int i = 1; i < arr.length; i++) {
				arr[i] = new int[n - i];
				
				for(int j = 1; j < arr[i - 1].length; j++) {
					int num = arr[i - 1][j] - arr[i - 1][j - 1];
					arr[i][j - 1] = num;
				}
			}
			
			for(int i = 0; i < arr[arr.length - 1].length; i++) {
				sb.append(arr[arr.length - 1][i]);
				
				if(i != arr[arr.length - 1].length - 1) {
					sb.append(",");
				}
			}
		}

		// print
		System.out.println(sb.toString());
		
		sc.close();
	}
}