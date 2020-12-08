package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B3
 * 
 * 1267번: 핸드폰 요금
 * https://www.acmicpc.net/problem/1267
 * 
 * PASS
 * B3
 */
public class Main_1267 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // <= 20
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // <= 10000
		}
		int yPrice = 10;
		int mPrice = 15;
		int result1 = 0; // 영식요금제 방식
		int result2 = 0; // 민식요금제 방식
		
		// logic
		result1 = calculate(arr, yPrice, 30); // 영식 요금제 확인	
		result2 = calculate(arr, mPrice, 60); // 민식 요금제 확인
		
		// print
		if(result1 > result2) {
			System.out.println("M " + result2);
		}else if(result1 < result2){
			System.out.println("Y " + result1);
		}else {
			System.out.println("Y M " + result1);
		}
		
		sc.close();
	}

	private static int calculate(int[] arr, int price, int second) {
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int m = arr[i];
			
			while(true) {
				if(m >= second) {
					result += price;
					m = m - second;
				}else{
					result += price;
					break;
				}
			}
		}
		
 		return result;
	}
}
