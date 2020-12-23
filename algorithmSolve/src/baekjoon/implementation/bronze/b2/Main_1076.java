package baekjoon.implementation.bronze.b2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 구현 / B2
 * 
 * 1076번: 저항
 * https://www.acmicpc.net/problem/1076
 * 
 * PASS
 * 24053947
 */
public class Main_1076 {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		String[] sVal = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		String[] sArr = new String[3];
		for(int i = 0; i < sArr.length; i++) {
			sArr[i] = sc.nextLine();
		}
		StringBuilder sb = new StringBuilder();
		
		// logic
		// 첫 번째, 두 번째 저항 옴
		for(int i = 0; i < sArr.length - 1; i++) {
			for(int j = 0; j < sVal.length; j++) {
				if(sArr[i].equals(sVal[j])) {
					sb.append(String.valueOf(j));
				}
			}
		}
		
		// 세 번째 저항 곱셈
		int m = 0;
		for(int i = 0; i < sVal.length; i++) {
			if(sVal[i].equals(sArr[2])) {
				m = (int) Math.pow(10, i);
			}
		}
		
		BigInteger result = new BigInteger(sb.toString());
		result = result.multiply(new BigInteger(String.valueOf(m)));
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
