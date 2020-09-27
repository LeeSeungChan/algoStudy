package programmers.lv1.pass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 12910: 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 * 
 * PASS
 * 
 * @author leeryan1814@gmail.com
 */
public class Solution_12910 {

	public static void main(String[] args) {
		//int[] arr = {5, 9, 7, 10};
		//int divisor = 5;
		
		//int[] arr = {2, 36, 1, 3};
		//int divisor = 1;
		
		int[] arr = {3, 2, 6};
		int divisor = 10;
		
		int[] result = solution(arr, divisor);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	private static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add((arr[i]));
			}
		}
		
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for(int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}
		
        return answer;
	}

}