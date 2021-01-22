package baekjoon.math.fail;

import java.util.*;

/**
 * 수학,구현 / B3
 * 
 * 1009번: 분산처리
 * https://www.acmicpc.net/problem/1009
 * 
 * ING
 */
public class Main_1009 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			
			int result = 0;
			if(a == 1) {
				result = 1;
			}else {
				list.add(a);
				
				for(int i = 1; i < b; i++) {
					int sub = (list.get(i - 1) * a);
					sub = sub % 10;
					
					if(list.contains(sub)) {
						break;
					}else {
						list.add(sub);
					}
				}
				
				// 수정
				int len = b % list.size();
				result = list.get(len);
			}
			
			System.out.println(result);
		}
		
		// print
		//for(int i = 1; i <= 12; i++) {
			//System.out.println("7 * " + i + " = " + (long)Math.pow(7, i));
		//}
		
		sc.close();
	}
}
