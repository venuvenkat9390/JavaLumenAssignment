package com.lumen.basics;

public class Pattern1n23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines=5;
		int counter=1;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
	}

}
