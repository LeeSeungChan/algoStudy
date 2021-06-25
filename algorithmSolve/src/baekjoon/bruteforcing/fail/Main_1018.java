package baekjoon.bruteforcing.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 브루트포스 / S5
 * 
 * 1018번: 체스판 다시 칠하기
 * https://www.acmicpc.net/problem/1018
 * 
 * ING
 */
public class Main_1018 {
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[][] arr = new String[n][m];
		for(int i = 0; i < arr.length; i++) {
			String str = sc.nextLine();

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				arr[i][j] = String.valueOf(ch);
			}
		}
		List<Integer> rList = new ArrayList<Integer>();
		int result = Integer.MAX_VALUE;

		// logic
		for(int i = 0; i <= n - 8; i++){
			for(int j = 0; j <= m - 8; j++){

				//// sub 배열 만들어서 파라미터로 전달
				int cnt = check(arr);
				rList.add(cnt);
			}
		}

		// print
		for(int i = 0; i < rList.size(); i++) {
			if (rList.get(i) < result) {
				result = rList.get(i);
			}
		}
		System.out.println(result);

		//printArray2D(arr);
		sc.close();
	}

	private static int check(String[][] arr) {
		// White (flag == true)
		// 짝수 행 : 짝수 열이 W / 홀수 열이 B
		// 홀수 행 : 짝수 열이 B / 홀수 열이 W
		// Black (flag == false)
		// 짝수 행 : 짝수 열이 B / 홀수 열이 W
		// 홀수 행 : 짝수 열이 W / 홀수 열이 B
		int wCnt = 0;
		int bCnt = 0;

		// [0][0] 요소가 W일 때
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				String str = arr[i][j];

				if(i % 2 == 0){ // 짝수 행
					if(j % 2 == 0){ // 짝수 열
						if(str.equals("B")){ // B이면 W로 변경
							wCnt++;
						}
					}else{ // 홀수 열
						if(str.equals("W")){ // W이면 B로 변경
							wCnt++;
						}
					}
				}else{ // 홀수 행
					if(j % 2 == 0){ // 짝수 열
						if(str.equals("W")){ // W이면 B로 변경
							wCnt++;
						}
					}else{ // 홀수 열
						if(str.equals("B")){ // B이면 W로 변경
							wCnt++;
						}
					}
				}
			}
		}

		// [0][0] 요소가 B일 때
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				String str = arr[i][j];

				if (i % 2 == 0) { // 짝수 행
					if (j % 2 == 0) { // 짝수 열
						if (str.equals("W")) { // B이면 W로 변경
							bCnt++;
						}
					} else { // 홀수 열
						if (str.equals("B")) { // W이면 B로 변경
							bCnt++;
						}
					}
				} else { // 홀수 행
					if (j % 2 == 0) { // 짝수 열
						if (str.equals("B")) { // W이면 B로 변경
							bCnt++;
						}
					} else { // 홀수 열
						if (str.equals("W")) { // B이면 W로 변경
							bCnt++;
						}
					}
				}
			}
		}

		if(wCnt > bCnt){
			return bCnt;
		}else{
			return wCnt;
		}
	}

	// 2차원 배열 print 함수
	private static void printArray2D(int[][] arr) {
 		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
