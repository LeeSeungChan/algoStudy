package baekjoon.fail;

import java.util.Scanner;

/**
 * DP / S1
 * 
 * 1149번: RGB거리
 * https://www.acmicpc.net/problem/1149
 * 
 * FAIL
 */
public class Main_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		
		for(int n = 1; n <= N; n++) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			int[] subArr = new int[3];
			subArr[0] = Integer.parseInt(strArr[0]);
			subArr[1] = Integer.parseInt(strArr[1]);
			subArr[2] = Integer.parseInt(strArr[2]);
		}
		
		sc.close();
	}

}
