package baekjoon.math.bronze.fail;

import java.util.*;

/**
 * 수학,구현 / B3
 * 
 * 1009번: 분산처리
 * https://www.acmicpc.net/problem/1009
 * 
 * 3 FAIL (틀렸습니다)
 */
public class Main_1009 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// logic
		for(int t = 0; t < T; t++) {
			int a = sc.nextInt() % 10;
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
				
				int find = b % (list.size());
				if(find == 0) {
					find = list.size() - 1;
				}else {
					find = find - 1;
				}
				result = list.get(find);
			}
			
			// print
			System.out.println(result);
		}
		
		sc.close();
	}
}
