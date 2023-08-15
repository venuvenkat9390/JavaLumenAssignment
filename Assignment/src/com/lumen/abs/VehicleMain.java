package com.lumen.abs;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle bike = new Bike("suzuki","alto",120000);
		bike.getMileage();
		
		Bike bike1 = (Bike)bike;
		bike1.engineType();
		
		Vehicle car = new Car("suzuki","alto",120000);
		
	}

}
