package baekjoon.combinatorics;

import java.util.Scanner;

/**
 * 분류
 * 
 * n번: 제목
 * https://www.acmicpc.net/problem/n
 * 
 * PASS / FAIL / ING
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("경우의 수:" + combination(3, 2));
		
		int[] arr = {1, 1, 3};
		boolean[] visited = new boolean[arr.length];
		
		//2. 재귀를 이용해 구현
        System.out.println("\n---------- 2. 재귀 ----------");
        for(int r = 1; r <= arr.length ; r++) {
        	System.out.println("\n" + arr.length + "개 중에 " + r  + "개 뽑음");
            comb2(arr, visited, 0, r);
        }
	}
	
	private static int combination(int n, int r) {
		if(n == r || r == 0) {
			return 1;
		}else {
			return combination(n - 1, r - 1) + combination(n - 1, r);
		}
	}
	
	private static void comb2(int[] arr, boolean[] visited, int depth, int r) {
		int sum = 0;
		
        if(r == 0) {
            print(arr, visited);
            return;
        }
        
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb2(arr, visited, depth + 1, r - 1);
 
            visited[depth] = false;
            comb2(arr, visited, depth + 1, r);
        }
    }
	
	// 배열 출력
    private static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
            	System.out.print(arr[i] + " ");
            }
        }
        
        System.out.println();
    }
}
