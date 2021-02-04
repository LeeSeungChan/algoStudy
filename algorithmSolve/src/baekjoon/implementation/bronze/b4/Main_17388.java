package baekjoon.implementation.bronze.b4;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 17388번: 와글와글 숭고한
 * https://www.acmicpc.net/problem/17388
 * 
 * PASS
 */
public class Main_17388 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int min = Integer.MAX_VALUE;
		int sum = 0;
		String[] srr = {"Soongsil", "Korea", "Hanyang"};
		int index = 0;
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
			if(arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		
		// print
		if(sum >= 100) {
			System.out.println("OK");
		}else {
			System.out.println(srr[index]);
		}
		
		sc.close();
	}
}
