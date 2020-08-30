package programmers.lv1.pass;

import java.util.Scanner;

/**
 * 12948. 핸드번 번호 가리기
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 *
 * PASS
 */
public class Solution_12948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = solution(s);
		
		System.out.println(result);
		sc.close();
	}
	
	public static String solution(String phone_number) {
        String answer = "";
        
        int len = phone_number.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
        	if(i < len - 4) {
        		sb.append("*");
        	}else {
        		sb.append(phone_number.charAt(i));
        	}
        }
        
        answer = sb.toString();
        
        // case1
        /*char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);*/
        
        //case2
        //return phone_number.replaceAll(".(?=.{4})", "*");
        
        return answer;
    }

}
