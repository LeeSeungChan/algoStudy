package baekjoon.implementation.bronze.fail;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 1236번: 성 지키기
 * https://www.acmicpc.net/problem/1236
 * 
 * FAIL: 런타임 에러
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
			/*for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextLine();
			}*/
			String str = sc.nextLine();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = String.valueOf(str.charAt(j));
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
				for(int k = 0; k < arr.length; k++) {
					if("X".equals(arr[k][j])) {
						xflag = true;
					}
				}
				
				if(!xflag) {
					arr[i][j] = "X";
					result++;
				}
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
