package com.lumen.basics;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1980;
		if(number%10 ==0)number/=10;
		int reverse_number =0;
		
		while(number>0) {
			reverse_number=reverse_number*10+(number%10);
			number/=10;
		}
		System.out.println("rever number of the give number is: "+reverse_number);
	}

}
