package com.lumen.scan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number ");
		String number = scanner.next();
		String palindrome="";
		for(int i=number.length()-1;i>=0;i--) {
			palindrome+=number.charAt(i);
		}
		System.out.println("palindrome number is= "+palindrome);
	}

}
