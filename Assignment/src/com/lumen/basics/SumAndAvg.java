package com.lumen.basics;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,9,45,88,1,4,8,48,8,65,21,65};
		int sum=0;
		for(int number : numbers) {
			sum+=number;
		}
		System.out.println("sum of elements in an array is = "+ sum);
		System.out.println("Average of elements in an array is = "+ sum/(numbers.length));
	}

}
