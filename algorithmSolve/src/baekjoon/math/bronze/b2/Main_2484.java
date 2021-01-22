package baekjoon.math.bronze.b2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 수학,구현,선형대수학 / B2
 * 
 * 2484번: 주사위 네개
 * https://www.acmicpc.net/problem/2484
 * 
 * PASS (간결한 소스는 무엇일까?)
 */
public class Main_2484 {
	public static void main(String[] args) {
		// initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[n];
		int[] price = {0, 1000, 10000, 50000};
		
		// logic
		for(int i = 0; i < n; i++) {
			int[] arr = new int[4];
			List<Result> list = new ArrayList<Result>();
			
			// input
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			// count 구하기
			for(int j = 0; j < arr.length; j++) {
				int sub = arr[j];
				int count = 0;
				
				for(int k = 0; k < arr.length; k++) {
					if(j != k && sub == arr[k] && arr[k] > -1) {
						arr[k] = -1;
						count++;
					}
				}
				
				if(count > 0) {
					Result obj = new Result(sub, count);
					list.add(obj);
				}
			}
			
			// 점수 계산하기
			if(list.size() == 2) {
				int d1 = list.get(0).getDice();
				int d2 = list.get(1).getDice();
				
				sum[i] = 2000 + 500 * d1 + 500 * d2;
			}else if(list.size() == 1) {
				int cost = price[list.get(0).getCount()];
				
				sum[i] = cost + list.get(0).getDice() * (cost / 10);
			}else {
				int max = arr[0];
				for(int j = 1; j < arr.length; j++) {
					if(max < arr[j]) {
						max = arr[j];
					}
				}
				
				sum[i] = max * 100;
			}
		}
		
		int max = sum[0];
		for(int j = 1; j < sum.length; j++) {
			if(max < sum[j]) {
				max = sum[j];
			}
		}
		// print
		System.out.println(max);
		
		sc.close();
	}
}

class Result {
	private int dice;
	
	private int count;
	
	public Result(int dice, int count) {
		super();
		this.dice = dice;
		this.count = count;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}