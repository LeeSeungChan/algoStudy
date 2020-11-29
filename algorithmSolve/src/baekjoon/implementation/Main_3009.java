package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현
 * 
 * 3009번: 네 번째 점
 * https://www.acmicpc.net/problem/3009
 * 
 * PASS
 */
public class Main_3009 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int[] xArr = new int[4];
		int[] yArr = new int[4];
		for(int i = 0; i < xArr.length - 1; i++) {
			xArr[i] = sc.nextInt();
			yArr[i] = sc.nextInt();
		}

		// logic
		// x 좌표 구하기
		for(int i = 0; i < xArr.length; i++) {
			int n = xArr[i];
			int count = 0;
			
			for(int j = 0; j < xArr.length; j++) {
				if(i != j && n == xArr[j]) {
					count++;
				}
			}
			
			if(count == 0) {
				xArr[3] = n;
				break;
			}
		}
		
		// y 좌표 구하기
		for(int i = 0; i < yArr.length; i++) {
			int n = yArr[i];
			int count = 0;
			
			for(int j = 0; j < yArr.length; j++) {
				if(i != j && n == yArr[j]) {
					count++;
				}
			}
			
			if(count == 0) {
				yArr[3] = n;
				break;
			}
		}
		
		// print
		System.out.println(xArr[3] + " " + yArr[3]);
		
		sc.close();
	}
}
