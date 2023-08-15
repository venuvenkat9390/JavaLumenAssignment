package com.lumen.basics;

public class Smallest {
	
	public static void main(String[] args) {
		int[] numbers = {10,-9,45,88,1,4,8,48,8,65,21,65};
		int smallest_number=numbers[0];
		for(int number : numbers) {
			smallest_number = Math.min(smallest_number, number);
		}
		
		System.out.println("smallest number in the array is : "+smallest_number);
	}
	}


