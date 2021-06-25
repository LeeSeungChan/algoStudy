package baekjoon.greedy.silver.s5;

import java.util.Scanner;

/**
 * 그리디 알고리즘 / S2
 * 
 * 11047번: 동전 0
 * https://www.acmicpc.net/problem/11047
 * 
 * FAIL (시간초과) : 2중 반복문 제거
 * FAIL (틀렸습니다) : 돈이 동전의 단위보다 큰 경우, 문제 해결
 * PASS (맞았습니다)
 */
public class Main_11047 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int result = 0;

		// logic
		int index = 0;
		boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			if(k < arr[i]){
				flag = true;
				index = i - 1;
				break;
			}
		}
		if(!flag){
			index = arr.length - 1;
		}

		for(int i = index; i >= 0; i--){
			result += (k / arr[i]);

			k = k % arr[i];
		}

		// print
		System.out.println(result);
		
		sc.close();
	}
}

//Arrays.sort(arr, Collections.reverseOrder());