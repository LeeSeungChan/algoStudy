package baekjoon.realization;

import java.util.Scanner;

public class Main_5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] set = new int[3];
		int[] drink = new int[2];
		
		for(int i = 0; i < set.length; i++){
			set[i] = sc.nextInt();
		}
		for(int i = 0; i < drink.length; i++){
			drink[i] = sc.nextInt();
		}
		
		int min = set[0] * drink[0];
		
		for(int i = 0; i < set.length; i++){
			for(int j = 0; j < drink.length; j++){
				int price = set[i] + drink[j];
				
				if(min > price){
					min = price;
				}
			}
		}
		
		System.out.println(min - 50);
		
		sc.close();
	}

}
