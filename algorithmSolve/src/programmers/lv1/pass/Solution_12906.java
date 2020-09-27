package programmers.lv1.pass;

import java.util.ArrayList;

/**
 * 12906: 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 * 
 * PASS
 * 
 * @author leeryan1814@gmail.com
 */
public class Solution_12906 {
	public static void main(String[] args) {
		int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
		//int[] arr2 = {4, 4, 4, 3, 3};
		
		int[] result = solution(arr1);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] solution(int[] arr) {
        int[] answer = {};
        //ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
        	if(i == 0) {
        		list.add(arr[i]);
        	}else {
        		if(arr[i] != arr[i - 1]) {
        			list.add(arr[i]);
        		}
        	}
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
	}
}