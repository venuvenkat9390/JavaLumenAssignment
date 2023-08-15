package com.lumen.basics;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,-9,45,88,1,4,8,48,8,65,21,65};
		int greatest_number=numbers[0];
		for(int number : numbers) {
			greatest_number = Math.max(greatest_number, number);
		}
		
		System.out.println("greatest number in the array is : "+greatest_number);
	}

}
