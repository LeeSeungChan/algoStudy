package baekjoon.greedy.bronze.b4;

import java.util.Scanner;

/**
 * 수학,구현,그리디 / B4
 * 
 * 10162번: 전자레인지
 * https://www.acmicpc.net/problem/10162
 * 
 * 4FAIL (실수 조심)
 * PASS
 */
public class Main_10162 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		// logic
		if(t % 10 == 0) {
			int[] arr = new int[3];
			
			while(true) {
				if(t >= 300) {
					arr[0] += t / 300;
					t = t % 300;
				}
				
				if(t >= 60) {
					arr[1] += t / 60;
					t = t % 60;
				}
				
				if(t >= 10){
					arr[2] += t / 10;
					t = t % 10;
				}
				
				if(t == 0) {
					break;
				}
			}
			
			// print
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		}else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}
