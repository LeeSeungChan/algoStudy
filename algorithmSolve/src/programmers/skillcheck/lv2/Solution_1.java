package programmers.skillcheck.lv2;

public class Solution_1 {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(solution(w, h));
	}

	public static long solution(int w, int h) {
        long answer = 1;
        long sum = 0;
        
        for(int i = w; i > 0; i--) {
        	double y = -1 * ((double) h / w * i) + h;
        	sum += (int) y;
        }
        
        answer = sum * 2;
        return answer;
    }
}
