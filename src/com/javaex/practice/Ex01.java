package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2]	= 12;  // 3 7 12 0 0
		
		int result = 0;
		
		for(int i=0; i<intArray.length; i++) {
		  result = result + intArray[i];
			/*System.out.println(intArray[i]); 이렇게써야 3 7 12 0 0나옴*/
		}
		System.out.println(result);
		
				
	}/*i=0일때 0+3 -> result = 3  여기서 끝인게아니고 이3 이 result값이 됨. 잘 이해하기
	   i=1일때 3+7 -> result = 10
	   i=2일때 10+12 -> result = 22 
	   [3][4]는 아무것도 없어서 0이니까 답은22
	   result = result+ intArray[i] 이거를 온전히 이해못했던듯 */

}
