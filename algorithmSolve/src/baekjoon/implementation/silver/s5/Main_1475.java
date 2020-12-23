package baekjoon.implementation.silver.s5;

import java.util.Scanner;

/**
 * 구현 / S5
 * 
 * 1475번: 방 번호
 * https://www.acmicpc.net/problem/1475
 * 
 * PASS
 */
public class Main_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = String.valueOf(sc.nextInt());
		
		double[] count = findCountArray(str);
		int result = findResult(count);
		
		System.out.println(result);
		
		sc.close();
	}

	private static int findResult(double[] count) {
		for(int i = 0; i < count.length; i++){
			count[i] = Math.ceil(count[i]);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < count.length; i++){
			if(max < count[i]){
				max = (int) count[i];
			}
		}
		
 		return max;
	}

	private static double[] findCountArray(String str) {
		String[] arr = new String[10];
		double[] count = new double[10];

		for(int i = 0; i < arr.length; i++){
			arr[i] = String.valueOf(i);
		}

		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			
			for(int j = 0; j < arr.length; j++){
				if(arr[j].equals(String.valueOf(ch))){
					if(ch == '6' || ch == '9'){
						count[arr.length - 1] += 0.5;
					}else{
						count[j] += 1.0;
					}
					
					break;
				}
			}
		}
		
 		return count;
	}

}
