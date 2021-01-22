package baekjoon.math.bronze.b3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 2754번: 학점계산
 * https://www.acmicpc.net/problem/2754
 * 
 * FAIL
 * PASS
 */
public class Main_2754 {
	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("A", 4.0);
		map.put("B", 3.0);
		map.put("C", 2.0);
		map.put("D", 1.0);
		map.put("F", 0.0);
		
		// input & initialize
		Scanner sc = new Scanner(System.in);
		double VAL = 0.3;
		String str = sc.nextLine();
		char grade = str.charAt(0);
		char exp = ' ';
		
		double result = 0;
		
		// logic
		if(map.containsKey(String.valueOf(grade))) {
			result += map.get(String.valueOf(grade));
		}
		
		if(str.length() > 1) {
			exp = str.charAt(1);
			
			if(exp == '+') {
				result = result + VAL;
			}else if(exp == '-') {
				result = result - VAL;
			}else {
				
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
