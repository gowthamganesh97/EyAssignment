package com.sapient.asde.service;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.sapient.asde.model.Car;

public interface CarService{
	public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	
	public double getHighPricedCar(List<Car> carList);
	
	public Car getCarWithLowPricedCar(List<Car> carList);
}

