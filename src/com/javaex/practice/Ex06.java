package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};

		
		c[4]=',';    //번호1부터 시작하는거라 생각해서 5 8 10으로 써서이상하게 나왔음 번호[0]부터시작하는거 까먹지 말기
		c[7]=',';
		c[9]=',';
		
		System.out.println(c);
		
	}

}
