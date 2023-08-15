package com.lumen.basics;

public class SecondGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,-9,45,88,1,4,8,48,8,65,21,65};
		int greatest_number = -9999999;
		int second_greatest = -9999999;
		for(int number : numbers) {
			if(number > greatest_number) {
				second_greatest = greatest_number;
				greatest_number = number;
			}
			else if(number < greatest_number && number > second_greatest) {
				second_greatest = number;
			}
			
		}
		
		System.out.println("second greatesr=t number is= "+second_greatest);
	}

}
