package com.sapient.asde.model;

public class Car {
	private String careMake;
	private String carName;
	private double price; 
	
	public Car() {
		
	}

	public Car(String careMake, String carName, double price) {
		super();
		this.careMake = careMake;
		this.carName = carName;
		this.price = price;
	}

	public String getCareMake() {
		return careMake;
	}

	public String getCarName() {
		return carName;
	}

	public double getPrice() {
		return price;
	}

	public void setCareMake(String careMake) {
		this.careMake = careMake;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [careMake=" + careMake + ", carName=" + carName + ", price=" + price + "]";
	}
	
	
}