package baekjoon.implementation;

import java.io.*;

public class Main_5585 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int price = 1000 - Integer.parseInt(br.readLine());
			int result = 0;
			int[] re = {500, 100, 50, 10, 5, 1};
			
			for(int i = 0; i < re.length; i++){
				if(price >= re[i]){
					result += price / re[i];
					price %= re[i];	
				}
			}
			
			/*if(price >= 500){
				result += price / 500;
				price %= 500;
			}
			if(price >= 100){
				result += price / 100;
				price %= 100;
			}
			if(price >= 50){
				result += price / 50;
				price %= 50;
			}
			if(price >= 10){
				result += price / 10;
				price %= 10;
			}
			if(price >= 5){
				result += price / 5;
				price %= 5;
			}
			if(price >= 1){
				result += price / 1;
			}*/
			
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
