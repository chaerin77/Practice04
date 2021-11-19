package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		num[0]= sc.nextInt();
		num[1]= sc.nextInt();
		num[2]= sc.nextInt();
		num[3]= sc.nextInt();
		num[4]= sc.nextInt();
		
		int sum=0;
		
		for(int i=0; i<num.length;i++) {
			
			sum=sum+num[i];
		}
		double average= sum/5.0;
		System.out.println("평균은 "+ average + " 입니다.");								

	}

}
