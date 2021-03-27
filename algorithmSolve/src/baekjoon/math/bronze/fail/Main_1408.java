package baekjoon.math.bronze.fail;

import java.util.Scanner;

/**
 * 수학,사칙연산 / B1
 * 
 * 1408번: 24
 * https://www.acmicpc.net/problem/1408
 * 
 * FAIL (틀렸습니다)
 * FAIL (틀렸습니다)
 */
public class Main_1408 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String etr = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		// logic
		int sSecond = transformTotal(str);
		int eSecond = transformTotal(etr);
		
		int h = (sSecond - eSecond) / 3600;
		String hh = transform(h);
		sb.append(hh + ":");
		
		int m = ((sSecond - eSecond) % 3600) / 60;
		String mm = transform(m);
		sb.append(mm + ":");
		
		int s = ((sSecond - eSecond) % 3600) % 60; 
		sb.append(s);
		
		// print
		System.out.println(sb.toString());
		
		sc.close();
	}

	private static String transform(int num) {
		if(num < 10) {
			return "0" + String.valueOf(num);
		}
		
		return String.valueOf(num);
	}

	// 시간을 초로 바꾸기
	private static int transformTotal(String s) {
		String[] srr = s.split(":");
		int second = Integer.parseInt(srr[0]) * 3600;
		second += Integer.parseInt(srr[1]) * 60;
		second += Integer.parseInt(srr[2]);
		
 		return second;
	}
}
