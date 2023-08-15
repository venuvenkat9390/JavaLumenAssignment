package com.lumen.basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		int answer=1;
		for(int i=1;i<=number ;i++) {
			answer*=i;
		}
		
		System.out.println("factorial of the number "+ number +" is "+ answer);
	}

}
