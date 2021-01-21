package baekjoon.implementation.bronze.b1;

import java.util.Scanner;

/**
 * 구현,문자열 / B1
 * 
 * 11098번: 첼시를 도와줘!
 * https://www.acmicpc.net/problem/11098
 * 
 * FAIL: 실수
 * PASS
 */
public class Main_11098 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int p = sc.nextInt();
			sc.nextLine();
			long[] cArr = new long[p];
			String[] nArr = new String[p];
			
			// input
			for(int i = 0; i < p; i++) {
				String str = sc.nextLine();
				
				String[] sArr = str.split(" ");
				cArr[i] = Long.parseLong(sArr[0]);
				nArr[i] = sArr[1];
			}
			
			// 최대 가격 구하기
			long max = cArr[0];
			int index = 0;
			for(int i = 1; i < cArr.length; i++) {
				if(max < cArr[i]) {
					max = cArr[i]; // 빠트린 부분
					index = i;
				}
			}
			
			// print
			System.out.println(nArr[index]);
		}
		
		sc.close();
	}
}