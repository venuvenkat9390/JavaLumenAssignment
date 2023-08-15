package com.lumen.basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		int armstrong_number =0;
		int change = number;
		
		while(change>0) {
			armstrong_number = armstrong_number+(int)Math.pow(change%10, 3);
			change/=10;
			
			
		}
		
		if(number==armstrong_number)System.out.println("entered number is an armstrong number");
		else System.out.println("etered number is not armstrong number");
		
		System.out.println(armstrong_number);
	}

}
