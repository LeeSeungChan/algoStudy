package baekjoon.pass;

import java.util.Scanner;

public class Main_10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int t = 0; t < T; t++){
			String s = sc.nextLine();
			String[] str = s.split(",");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.println(a + b);
		}
		
		sc.close();
	}

}
