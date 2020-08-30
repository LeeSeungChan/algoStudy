package programmers.lv1.pass;

import java.util.Scanner;

/**
 * 12918. 문자열 다루기 기본
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * PASS
 */
public class Solution_12918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean result = solution(s);
		
		System.out.println(result);
		sc.close();
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
        	for(int i = 0; i < s.length(); i++) {
        		char ch = s.charAt(i);
        		int c = (char)ch;
        		
        		if(c < 48 || c > 57) {
        			answer = false;
        			break;
        		}
        	}
        }else {
        	answer = false;
        }
        
        return answer;
    }

}
