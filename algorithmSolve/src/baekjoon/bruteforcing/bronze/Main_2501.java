package baekjoon.bruteforcing.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 수학, 브루트포스 / B3
 * 
 * 2501번: 약수 구하기
 * https://www.acmicpc.net/problem/2501
 * 
 * FAIL (틀렸습니다) : 단순 실수
 * PASS
 */
public class Main_2501 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();

		// logic
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				list.add(i);
			}
		}

		if(list.size() >= k){
			result = list.get(k - 1);
		}

		// print
		System.out.println(result);

		sc.close();
	}
}
