package baekjoon.math.sprout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 수학,구현,사칙연산
 * 
 * 10951번: A+B - 4
 * https://www.acmicpc.net/problem/10951
 * 
 * PASS / FAIL / ING
 */
public class Main_10951 {
	public static void main(String[] args) throws IOException {
		// input & initialize
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = in.readLine();
			
			if(str == null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
		
		out.flush();
		out.close();
		in.close();
	}
}
