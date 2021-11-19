package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9}; //방3개  앞에 new int 생략된것
		
		int[] intB; //얘는 new int로 만들어준게 아니라서 네모 공간이 안생겼나봄 그래서 같은주소 가리키고있는 상태
		intB = intA; //intB [0]3   [1]6   [2]9
		intB[0] = 20;
		intB[2] = 10;//intB [0]20  [1]6   [2]10
		
		for(int i=0; i<intA.length; i++) {//i<3 i 0,1,2까지 돌리겠다
			System.out.println(intA[i]); // 3  6  9--> 네모없이 같은주소가리키는상태란거 이해못해서 이렇게 예상함
		}

	}

}
