package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 수학
 * 
 * 1977번: 완전제곱수
 * https://www.acmicpc.net/problem/1977
 * 
 * PASS
 * B1
 */
public class Main_1977 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int total = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		// logic
		for(int i = m; i <= n; i++) {
			double g = Math.sqrt(i); // 제곱근 구하기
			int d = (int) g;
			double r = g - d;
			
			if(r == 0) {
				list.add(i); // 최소값 구하는 다른 방법은?
				total += i;
			}
			
		}
		// print
		if(total > 0) {
			System.out.println(total);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}
