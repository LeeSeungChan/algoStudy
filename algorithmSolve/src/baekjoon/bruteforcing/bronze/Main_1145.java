package baekjoon.bruteforcing.bronze;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / B1
 * 
 * 1145번: 적어도 대부분의 배수
 * https://www.acmicpc.net/problem/1145
 * 
 * FAIL (틀렸습니다)
 * PASS
 */
public class Main_1145 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		// logic
		for(int i = 1; i < 1000000; i++) {
			int cnt = 0;
			boolean flag = false;
			
			for(int j = 0; j < arr.length; j++) {
				if(i % arr[j] == 0) {
					cnt++;
					
					if(cnt >= 3) {
						flag = true;
						break;
					}
				}
			}
			
			if(flag) {
				result = i;
				break;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
