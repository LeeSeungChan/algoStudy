package baekjoon.implementation.fail;

import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 2456번: 나는 학급회장이다
 * https://www.acmicpc.net/problem/2456
 * 
 * PASS / FAIL / ING
 */
public class Main_2456 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] sum = new int[3];
		int[][] cnt = new int[3][3]; // 행 구분: 후보, 열 구분: 1 2 3점 개수
		
		// logic
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < arr.length; j++) {
				int num = arr[j][i];
				sum[i] += num;
				
				if(num == 3) {
					cnt[i][2]++;
				}else if(num == 2) {
					cnt[i][1]++;
				}else {
					cnt[i][0]++;
				}
			}
		}
	
		char flag = ' ';
		int count = 0;
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++) {
				if(i != j && sum[i] == sum[j]) {
					count++;
				}
			}
			
			if(count == 2) {
				flag = '2';
				break;
			}else if(count == 1) {
				flag = 1;
			}else {
				// nothing
			}
		}
		
		int max = 0;
		int index = 0;
		for(int i = 1; i < sum.length; i++) {
			if(sum[i] > max) {
				index = i;
				max = sum[i];
			}
		}
		
		if(flag == 0) {
			System.out.println(index + " " + sum[index]);
		}else if(flag == 1) {
			
		}else {
			
		}
		
		sc.close();
	}
}
