package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 10797번: 10부제
 * https://www.acmicpc.net/problem/10797
 * 
 * PASS
 */
public class Main_10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int[] car = new int[5];
		int result = 0;

		for(int i = 0; i < car.length; i++){
			car[i] = sc.nextInt();
			
			if(day == car[i]){
				result++;
			}
		}

		System.out.println(result);
		
		sc.close();
	}

}
