package com.lumen.abs;

public class Car extends Vehicle {

	Car(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMileage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		
	}
	
	 String[] accessories() {
		String[] accessories = {"cover","tool kit","freshner","carpet"};
		return accessories;
	}

}
