package com.lumen.basics;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =55;
		for(int i=2;i<number;i++){
			if(number%i==0) {
				System.out.println("Entered Number is not prime");
				return;
			}
		}
		System.out.println("Entered Number is prime");
	}

}
