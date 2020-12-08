package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B3
 * 
 * 9550번: 아이들은 사탕을 좋아해
 * https://www.acmicpc.net/problem/9550
 * 
 * PASS
 */
public class Main_9550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			int result = 0;
			
			// 2번째 줄 input
			for(int i = 0; i < arr.length; i++){
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < arr.length; i++){
				if(arr[i] >= k){
					result += arr[i] / k;
				}
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}

}
