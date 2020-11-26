package baekjoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 구현
 * 
 * 3047번: ABC
 * https://www.acmicpc.net/problem/3047
 * 
 * PASS
 */
public class Main_3047 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		String str = sc.nextLine();
		
		// logic
		Arrays.sort(arr);
		for(int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			
			if("A".equals(s)) {
				result[i] = arr[0];
			}else if("B".equals(s)) {
				result[i] = arr[1];
			}else {
				result[i] = arr[2];
			}
		}
		
		// print
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
