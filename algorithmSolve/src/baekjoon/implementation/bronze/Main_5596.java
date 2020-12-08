package baekjoon.implementation.bronze;

import java.util.Scanner;

/**
 * 구현 / B4
 * 
 * 5596번: 시험 점수
 * https://www.acmicpc.net/problem/5596
 * 
 * PASS
 */
public class Main_5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[4];
		int sTotal = 0;
		int[] t = new int[4];
		int tTotal = 0;
		int result = 0;
		
		for(int i = 0; i < s.length; i++){
			s[i] = sc.nextInt();
			sTotal += s[i];
		}
		for(int i = 0; i < t.length; i++){
			t[i] = sc.nextInt();
			tTotal += t[i];
		}
		
		if(sTotal >= tTotal){
			result = sTotal;
		}else{
			result = tTotal;
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
