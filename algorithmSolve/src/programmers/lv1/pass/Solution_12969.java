package programmers.lv1.pass;

import java.util.Scanner;

/**
 * 12969. 직사각형 별찍기
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 * 
 * PASS
 */
public class Solution_12969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
		sc.close();
	}

}
