package baekjoon.implementation;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 1236번: 성 지키기
 * https://www.acmicpc.net/problem/1236
 * 
 * ING
 */
public class Main_1236 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[][] arr = new String[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextLine();
			}
		}
		int result = 0;
		
		// logic
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				boolean xflag = false;
				
				// 행 검사
				for(int k = 0; k < arr[i].length; k++) {
					if("X".equals(arr[i][k])) {
						xflag = true;
					}
				}
				
				// 경비원이 있으면 다음 행으로 이동
				if(xflag) {
					break;
				}
				
				// 열 검사
				for(int k = 0; k < arr[i].length; k++) {
					if("X".equals(arr[k][i])) {
						xflag = true;
					}
				}
				
				if(!xflag) {
					arr[i][i] = ".";
					result++;
				}
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
