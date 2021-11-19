package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
				    // new int[13] 쓰고밑에쭉 쓰는방식있는데 너무 오래걸릴것같으니까 이거 생략하고 다른표현법사용하기
	
	     for(int i =0; i<data.length;i++) {
	    	 
	    	 if( data[i] %3 ==0) {
		    	 
		    	 System.out.println(data[i]); //개수를어떻게구함?? 출력되는횟수 이런거 정할수가있나
		     }
	     }
		
	}

}
