package baekjoon.implementation.silver.s4;

import java.util.Scanner;
import java.util.Stack;

/**
 * 구현,자료구조,문자열,스택 / S4
 * 
 * 10773번: 제로 
 * https://www.acmicpc.net/problem/10773
 * 
 * PASS
 */
public class Main_10773 {
	// 방법 1
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		int result = 0;
		
		// logic
		for(int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				if(!st.isEmpty()) {
					st.pop();
				}
			}else {
				st.push(num); // add와 push의 차이는?
			}
		}
		
		if(st.size() == 0) {
			result = 0;
		}else {
			for(int i = 0; i < st.size(); i++) {
				result += st.get(i);
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
	
	// 방법2
	/*public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				list.remove(list.size() - 1);
			}else {
				list.add(num);
			}
		}
		
		// logic
		if(list.size() == 0) {
			result = 0;
		}else {
			for(int i = 0; i < list.size(); i++) {
				result += list.get(i);
			}
		}
		
		// print
		System.out.println(result);
		
		
		sc.close();
	}*/
}
