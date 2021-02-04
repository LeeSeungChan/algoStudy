package baekjoon.math.bronze.b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 수학,정수론 / B1
 * 
 * 9506번: 약수들의 합
 * https://www.acmicpc.net/problem/9506
 * 
 * PASS (약수를 구하는 다른 방법이 있는가)
 *  collection 확인하는 경우, 반복문 / iterator
 */
public class Main_9506 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		// logic
		while(true) {
			n = sc.nextInt();
			
			if(n == -1) {
				break;
			}
			
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			
			StringBuilder result = new StringBuilder(String.valueOf(n));
			if(sum == n) {
				result.append(" = ");
				for(int i = 0; i < list.size(); i++) {
					result.append(list.get(i));
					
					if(i != list.size() - 1) {
						result.append(" + ");
					}
				}
			}else {
				result.append(" is NOT perfect.");
			}

			// print
			System.out.println(result.toString());
		};
		
		sc.close();
	}
}
