package baekjoon.realization;

import java.util.*;

/**
 * 심부름 가는 길
 * 
 * https://www.acmicpc.net/problem/5554
 * @ leeryan1814@gmail.com
 */
public class Main_5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		int n3 = Integer.parseInt(sc.nextLine());
		int n4 = Integer.parseInt(sc.nextLine());
		int x = 0;
		int y = 0;
		
		int totalSecond = n1 + n2 + n3 + n4;
		x = totalSecond / 60;
		y = totalSecond % 60;
		
		System.out.println(x + "\n" + y);
		
		sc.close();
	}
}
