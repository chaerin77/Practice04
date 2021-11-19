package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
				    // new int[13] 쓰고밑에쭉 쓰는방식있는데 너무 오래걸릴것같으니까 이거 생략하고 다른표현법사용하기
	    int sum = 0;
	    int count = 0; //***개수를 임의로 지정해줌
		
	     for(int i =0; i<data.length;i++) {
	    	 
	    	 if( data[i] %3 ==0) {
		    	 
		    	sum=sum+data[i];
	    		count++;//***3의 배수 일때마다 이 값이 증가될테니까 개수랑 일맥상통함 
		     }
	     }
	   //System.out.println(data[i]); //개수를어떻게구함?? 출력되는횟수 이런거 정할수가있나 --> 있나봄...정하면됨...
	     System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
	     System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
		
	}

}
