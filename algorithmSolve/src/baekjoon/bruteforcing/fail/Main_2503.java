package baekjoon.bruteforcing.fail;

import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / S5
 * 
 * 2503번: 숫자 야구
 * https://www.acmicpc.net/problem/2503
 * 
 * FAIL (틀렸습니다)
 */
/*
123 1 1
356 1 0
327 2 0
489 0 1 
*/
public class Main_2503 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[][] srr = new String[n][3];
		int result = 0;
		
		// input
		for(int i= 0; i < n; i++) {
			String str = sc.nextLine();
			String[] subSrr = str.split(" ");
			for(int j = 0; j < subSrr.length; j++) {
				srr[i][j] = subSrr[j];
			}
		}
		
		int num = 111;
		for(int i = num; i <= 999; i++) {
			// i의 각 자리 수는 서로 다은 숫자이어야 한다.
			if(validation(i)) {
				continue;
			}
			
			boolean flag = false;
			boolean subFlag1 = false;
			boolean subFlag2 = false;
			
			if(i == 324) {
				System.out.println(i);
			}

			for(int j = 0; j < srr.length; j++) {
				subFlag1 = checkStrike(i, srr[j][0], Integer.parseInt(srr[j][1]));
				
				if(!subFlag1) {
					flag = true;
					break;
				}
				
				subFlag2 = checkBall(i, srr[j][0], Integer.parseInt(srr[j][2]));
				if(!subFlag2) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				result++;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}

	private static boolean validation(int num) {
		boolean returnFlag = false;
		String str = String.valueOf(num);
		
		// 0이 들어가있으면 제외
		if(str.indexOf("0") > -1) {
			return true;
		}
		
		for(int i = 0; i < str.length() - 1; i++) {
			boolean flag = false;
			
			for(int j = i + 1; j < str.length(); j++) {
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(j);
				
				if(ch1 == ch2) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				returnFlag = true;
				break;
			}
		}
		
		if(returnFlag) {
			return true; // 해당 숫자는 사용 못함
		}else {
			return false;
		}
	}

	private static boolean checkBall(int num, String answer, int ball) {
		String str = String.valueOf(num);
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < answer.length(); j++) {
				if(i != j) {
					char ch1 = str.charAt(i);
					char ch2 = answer.charAt(j);
					
					if(ch1 == ch2) {
						cnt++;
					}
				}
			}
		}
		
		if(cnt == ball) {
			return true;
		}else {
			return false;
		}
	}

	private static boolean checkStrike(int num, String answer, int strike) {
		String str = String.valueOf(num);
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			char ch2 = answer.charAt(i);
			
			if(ch1 == ch2) {
				cnt++;
			}
		}
		
		if(cnt == strike) {
			return true;
		}else {
			return false;
		}
	}
}
