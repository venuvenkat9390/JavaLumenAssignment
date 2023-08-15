package com.lumen.abs;

public abstract class Vehicle {
	
	String model;
	String brand;
	double price;
	
	Vehicle(String model,String brand,double price){
		this.model = model;
		this.brand=brand;
		this.price=price;
	}
	
	abstract void getMileage();
	abstract void showType();
	
}
