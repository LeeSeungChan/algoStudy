package programmers.lv1.pass;

import java.util.Scanner;

/**
 * 12947. 하샤드 수
 * https://programmers.co.kr/learn/courses/30/lessons/12947
 *
 * PASS
 * 
 * leeryan1814@gmail.com
 */
public class Solution_12947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		boolean flag = solution(x);
		System.out.println(flag);
		
		sc.close();
	}
	
	 public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int origin = x;
        
        //int length = (int)(Math.log10(x) + 1);
        
        while(true) {
        	sum += x % 10;
        	x = x / 10;
        	
        	if(x < 10) {
        		sum += x;
        		break;
        	}
        }
        
        if(origin % sum != 0) {
        	answer = false;
        }
        
        return answer;
    }
}
