package com.lumen.fun;

public class Any {
	public static void main(String[] args) {
		try {
			  int x = 10/0; 
			 } catch (ArithmeticException e1) {
			     System.out.print("a");
			 } catch (Exception e2) {
			     System.out.print("b");
			} finally {
			     System.out.print("c");
			 }
	}
}
