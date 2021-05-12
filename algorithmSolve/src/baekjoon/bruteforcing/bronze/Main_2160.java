package baekjoon.bruteforcing.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 브루트포스 알고리즘 / B1
 * 
 * 2160번: 그림 비교
 * https://www.acmicpc.net/problem/2160
 * 
 * FAIL
 * PASS (단순 로직 오류)
 */
public class Main_2160 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[][] srr = new String[5 * n][7];
		for(int i = 0; i < srr.length; i++) {
			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				srr[i][j] = String.valueOf(str.charAt(j));
			}
		}
		int[] result = new int[2];
		
		// logic
		List<String[][]> list = separate(srr);
		result = findResult(list);
		
		// print
		System.out.println(result[0] + " " + result[1]);
		
		sc.close();
	}

	// 메인 로직
	private static int[] findResult(List<String[][]> list) {
		int[] resultArr = new int[2];
		int min = Integer.MAX_VALUE;
		
		// 2중 반복문을 통하여 그림 전수 조사 (i번째 그림은 i+1번째 부터 n번째 요소까지 검사)
		// 예) 1번째 요소는 2 ~ n번째 요소 검사, 2번째 요소는 3 ~ n번째 요소 검사
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				String[][] check1 = list.get(i);
				String[][] check2 = list.get(j);
				
				int cnt = checkDifferentCount(check1, check2);
				
				if(cnt < min) {
					min = cnt;
					resultArr[0] = i + 1;
					resultArr[1] = j + 1;
				}
			}
		}
		
 		return resultArr;
	}

	// 그림의 각 요소를 비교하여 다른 개수 확인
	private static int checkDifferentCount(String[][] check1, String[][] check2) {
		int resultCount = 0;
		
		for(int i = 0; i < check1.length; i++) {
			for(int j = 0; j < check1[i].length; j++) {
				String ch1 = check1[i][j];
				String ch2 = check2[i][j];
				
				if(!ch1.equals(ch2)) {
					resultCount++;
				}
			}
		}
		
 		return resultCount;
	}

	// 그림(2차원 배열에 저장됨)을 N개로 분리하여 List에 저장 
	private static List<String[][]> separate(String[][] srr) {
		List<String[][]> resultList = new ArrayList<String[][]>();
		String[][] sub = null;
		
		for(int i = 0; i < srr.length; i++) {
			int index = i % 5;
			if(index == 0) {
				sub = new String[5][7];
			}
			
			for(int j = 0; j < srr[i].length; j++) {
				sub[index][j] = srr[i][j];
			}
			
			// 5행 체크
			if(index == 4) {
				resultList.add(sub);
			}
		}
		
 		return resultList;
	}
}
