package baekjoon.pass;

import java.util.Scanner;

public class Main_1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = findLCM(a, b);
			
			System.out.println(result);
		}
		
		sc.close();
	}

	private static int findLCM(int a, int b) {
		int big = (a > b)? a : b;
		int result = 0;
		
		for(int i = big; ; i++){
			if((i % a == 0) && (i % b == 0)){
				result = i;
				break;
			}
		}
		
 		return result;
	}
}
