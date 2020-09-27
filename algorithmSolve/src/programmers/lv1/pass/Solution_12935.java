package programmers.lv1.pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 12935. 제일 작은 수 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 * 
 * PASS
 * 
 * leeryan1814@gmail.com
 */
public class Solution_12935 {
	public static void main(String[] args) {
		int[] t1 = {4, 3, 2, 1};
		//int[] t2 = {10};
		
		int[] result = solution(t1);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
        	answer = new int[1];
            answer[0] = -1;
        }else{
        	int[] sub = new int[arr.length];
        	for(int i = 0; i < sub.length; i++) {
        		sub[i] = arr[i];
        	}
        	
            Arrays.sort(sub);
            int min = sub[0];
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i = 0; i < arr.length; i++) {
            	if(min != arr[i]) {
            		list.add(arr[i]);
            	}
            }
            
            int idx = 0;
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
            	answer[idx++] = list.get(i);
            }
        }
        
        return answer;
    }
}
