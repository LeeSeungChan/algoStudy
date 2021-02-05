package baekjoon.implementation.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 구현 / B1
 * 
 * 2456번: 나는 학급회장이다
 * https://www.acmicpc.net/problem/2456
 * 
 * FAIL (틀렸습니다)
 */
public class Main_2456 {
	public static void main(String[] args) {
		// initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		int[] sum = new int[3]; // 점수 득표 저장
		int[][] cnt = new int[3][3]; // 행 구분: 후보, 열 구분: 1 2 3점 개수
		int result1 = 0;
		int result2 = 0;
		
		// input
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
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
		
		// 최대 득표 값 구하기
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < sum.length; i++) {
			if(sum[i] > max) {
				max = sum[i];
			}
		}

		// 최대값과 같은 후보 구함
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < sum.length; i++) {
			if(max == sum[i]) {
				list.add(i);
				count++;
			}
		}
		
		if(count == 1) {
			// 1명이 최다 득표
			result1 = list.get(0) + 1;
			result2 = sum[list.get(0)];
		}else {
			int count3 = 0;
			List<Integer> sub = new ArrayList<Integer>();
			int max3 = Math.max(Math.max(cnt[0][2], cnt[1][2]), cnt[2][2]);
			for(int i = 0; i < cnt.length; i++) {
				if(max3 == cnt[i][2]) {
					sub.add(i);
					count3++;
				}
			}
			
			if(count3 == 1) { // 3점 득표수가 가장 많은 사람이 1명인 경우
				result1 = sub.get(0) + 1;
				result2 = sum[sub.get(0)];
			}else {
				int max2 = Integer.MIN_VALUE;
				for(int i = 0; i < sub.size(); i++) {
					if(cnt[i][sub.get(i)] > max2) {
						max2 = cnt[i][sub.get(i)];
					}
				}
				int count2 = 0;
				
			}
		}
		
		System.out.println(result1 + " " + result2);
		
		sc.close();
	}
}
