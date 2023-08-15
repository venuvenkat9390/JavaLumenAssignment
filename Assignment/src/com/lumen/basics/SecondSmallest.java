package com.lumen.basics;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,-9,45,88,1,4,8,48,8,65,21,65};
		int smallest=9999999;
		int second_smallest=9999999;
		
		for(int number : numbers) {
			if(number < smallest) {
				second_smallest = smallest;
				smallest = number;
				
			}
			else if(number > smallest && number < second_smallest )second_smallest = number;
		}
		
		System.out.println(second_smallest);
		
	}

}
