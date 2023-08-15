package com.lumen.basics;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userNames = {"Ram","Hanuman","Krishna"};
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter ur name");
		String name=scanner.next();
		for(String urname:userNames) {
			if(urname.equalsIgnoreCase(name)) {
			System.out.println("ur name is not unique");
			return;
			}
		}
		System.out.println("welcome "+name);
	}

}
