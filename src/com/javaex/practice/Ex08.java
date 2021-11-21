package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] num = new int [6]; //방의 개수
		
		for(int i=0; i<6; i++) {
			
			num[i]= (int)(Math.random()*45)+1;
			
			for(int y=0; y<i ; y++) {
				
				while(num[i]==num[y]) {
					
					num[i]=(int)(Math.random()*45)+1;
					
				} 
				
			}
			
			System.out.println(num[i]);
		}
	}
}


