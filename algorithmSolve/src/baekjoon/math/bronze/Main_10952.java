package baekjoon.math.bronze;

import java.util.Scanner;

/**
 * 수학,구현,사칙연산 / B3
 * 
 * 10952번: A + B - 5
 * https://www.acmicpc.net/problem/10952
 * 
 * PASS
 */
public class Main_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0){
				break;
			}else{
				System.out.println(a + b);
			}
		}
		
		sc.close();
	}

}
