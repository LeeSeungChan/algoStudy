package baekjoon.fail;

import java.util.Scanner;

/**
 * DP / S3
 * 
 * 1003번: 피보나치함수
 * https://www.acmicpc.net/problem/1003
 * 
 * FAIL (시간초과 - 0.25초)
 */
public class Main_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int[] zrr = new int[n + 2];
			zrr[0] = 1;
			zrr[1] = 0;
			int[] orr = new int[n + 2];
			orr[0] = 0;
			orr[1] = 1;
			
			for(int i = 2; i < zrr.length; i++) {
				zrr[i] = zrr[i - 1] + zrr[i - 2];
				orr[i] = orr[i - 1] + orr[i - 2]; 
			}
			
			System.out.println(zrr[n] + " " + orr[n]);
		}
		
		sc.close();
	}
}
