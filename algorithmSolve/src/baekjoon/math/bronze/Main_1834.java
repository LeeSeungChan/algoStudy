package baekjoon.math.bronze;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 수학 / B1
 * 
 * 1834번: 나머지와 몫이 같은 수
 * https://www.acmicpc.net/problem/1834
 * 
 * 4 FAIL - 출력초과, 시간초과, 틀렸습니다, 컴파일 에러
 * 1 PASS
 */
public class Main_1834 {
	/* 
	 * 변수(result) 범위 고려 : long으로도 안됨 -> BigInteger 사용
	 * 시간초과를 벗어나기 위해 : i 증가 조건 추가(34줄), 반복문에 break문 조건 추가(37줄)
	 */
	public static void main(String[] args) {
		// input & initialize
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max = (long) 2000000 * 2000000;
		BigInteger result = new BigInteger("0");
		
		// logic
		for(long i = n; i < max; i++) {
			long s = i / n;
			long r = i % n;
			
			if(s == r) {
				result = result.add(new BigInteger(String.valueOf(i)));
				i = i + n;
			}
			
			if(i > (long) n * n) {
				break;
			}
		}
		
		// print
		System.out.println(result);
		
		sc.close();
	}
}
