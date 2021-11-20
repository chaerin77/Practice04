package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int[] wonArray = new int[10];
        wonArray[0] = 50000;
        wonArray[1] = 10000;
        wonArray[2] = 5000;
        wonArray[3] = 1000;
        wonArray[4] = 500;
        wonArray[5] = 100;
        wonArray[6] = 50;
        wonArray[7] = 10;
        wonArray[8] = 5;
        wonArray[9] = 1;
        
        int sum=0;
        
        
        for(int i=0; i<wonArray.length; i++) {
        	
        	if(50000<=money && money<100000) {
        		
        		do {
        	sum=sum+wonArray[i];
        		} while(sum != money  ); //continue쓰는것도고려해볼것 뭐...일단 50000~5까지 다 더했는데 그러고도 money가 다더한sum보다 크면 그때부터이제 money값이 될때까지 뭐든 지알아서 이것저것 더해보라고시키는..?
        	}
        }
        /*몇개로 변환되는가, 변환된개수 * wonArray[i]값을 다 더해주면 money가 나와야하는데
          println "10000원: " + n  +"개"  저 n을 어떻게나오게할까
          일단 처음엔 저거 한번씩 다 더해주는데 그다음에 돌아갈때 
          sum으로 더한금액보다 지금 다시 들어갈 돈이 크면 걔는패스되게하고 다른애가 들어가게끔...*/
        
        
        
        
        
        
        System.out.println("금액: " + money);
		sc.close();
	}

}
