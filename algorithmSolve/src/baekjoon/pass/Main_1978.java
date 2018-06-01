package baekjoon.pass;

import java.util.Scanner;

public class Main_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		int result = countPrimeNumber(arr);
		
		System.out.println(result);
		
		sc.close();
	}

	private static int countPrimeNumber(int[] arr) {
		int result = 0;
		
		for(int i = 0; i < arr.length; i++){
			int n = arr[i];
			int d = 1;
			int subCount = 0;
			
			for(int j = 1; j <= n; j++){
				if(n % d == 0){
					subCount++;
				}
				d++;
			}
			
			if(subCount == 2){
				result++;
			}
		}
		
 		return result;
	}
}
