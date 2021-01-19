package baekjoon.math.bronze.b3;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 2863번: 이게 분수?
 * https://www.acmicpc.net/problem/2863
 * 
 * FAIL (temp 활용 값 바꿔치기 실수)
 * PASS
 */
public class Main_2863 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double[] sum = new double[4];
		
		// logic
		// 반복문 돌려서 하드코딩 방지
		for(int i = 0; i < sum.length; i++) {
			double total = ((double)a / c) + ((double)b / d);
			sum[i] = total;
			
			int temp = a;
			a = c;
			c = d;
			d = b;
			b = temp;
		}
		
		// 최대값 구하기
		double max = sum[0];
		for(int i = 1; i < sum.length; i++) {
			if(max < sum[i]) {
				max = sum[i];
			}
		}
		
		// print
		// max인 요소 중 최소의 index를 print 한다
		for(int i = 0; i < sum.length; i++) {
			if(max == sum[i]) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}
}
