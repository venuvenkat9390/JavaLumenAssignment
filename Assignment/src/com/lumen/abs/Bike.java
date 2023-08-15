package com.lumen.abs;

public class Bike extends Vehicle{

	Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("mileage of an bike is +"+(price/12000));
	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		System.out.println("the brand of an bike is= "+brand);
		System.out.println("the model of an bike is= "+model);
		System.out.println("the brand of an bike is= "+brand);
		
	}
	
	void engineType() {
		
		System.out.println("the engine of the bike is an sports bike");
		
	}

}
