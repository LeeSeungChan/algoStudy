package baekjoon.math.silver.s5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 수학,정수론 / S5
 * 
 * 1037번: 약수
 * https://www.acmicpc.net/problem/1037
 * 
 * PASS (테스트케이스를 먼저 생각하고 로직을 작성한다)
 */
public class Main_1037 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		// logic
		if(n == 1) {
			// 제곱수
			result = arr[0] * arr[0];
		}else if(n == 2) {
			// 1과 N이 아닌 약수 2개인 수
			result = arr[0] * arr[1];
		}else {
			// 약수가 2개 초과인 경우
			Arrays.sort(arr);
			result = arr[0] * arr[arr.length - 1];
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}

// int max = Collections.max(numList);
// int min = Collections.min(numList);
