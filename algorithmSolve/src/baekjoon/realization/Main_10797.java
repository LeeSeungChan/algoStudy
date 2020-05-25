package baekjoon.realization;

import java.util.Scanner;
/**
 * 
 * @author leeryan1814
 *
 */
public class Main_10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int[] car = new int[5];
		int result = 0;

		for(int i = 0; i < car.length; i++){
			car[i] = sc.nextInt();
			
			if(day == car[i]){
				result++;
			}
		}

		System.out.println(result);
		
		sc.close();
	}

}
