package baekjoon.pass;

import java.util.*;

public class Main_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();	// n<=12346
			
			if(n == 0){
				break;
			}
			
			int count = findPrimeNumber(n);
			
			System.out.println(count);
		}
		
		sc.close();
	}

	private static int findPrimeNumber(int n) {
		int count = 1;
		
		for(int i = n; i <= 2*n; i++){
			int k = 0;
			
			for(int j = 1; j <= i; j++){
				if(j % 2 != 0){
					if(i % j == 0){	
						k++;
					}
				}
			}
			
			if(k == 2){
				count++;
			}
		}
		
 		return count;
	}
}
