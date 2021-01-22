package baekjoon.implementation.bronze.b1;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 3943번: 헤일스톤 수열
 * https://www.acmicpc.net/problem/3943
 * 
 * FAIL : 메모리 초과
 * PASS : 최대값 구하는 것을 while문 안에서 한 번에 해결
 */
public class Main_3943 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int max = n;
			
			while(n != 1) {
				if(n % 2 == 0) { // 짝수
					n = n / 2;
				}else { // 홀수
					n = n * 3 + 1;
				}
				
				if(max < n) {
					max = n;
				}
			}
			
			// print
			System.out.println(max);
		}
		
		sc.close();
	}
}
