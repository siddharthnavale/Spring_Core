package com.SpringCore.SpringCore.LifeCycle.ThroughInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean {
	 private String modelNumber;
	 private String manufacturer;
	 private String price;
	 
	public Car() {
	
	}

	public Car(String modelNumber, String manufacturer, String price) {
		super();
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Intialization.....");
		
	}
	 

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Cleaning up.......");
	
	}

	
	
	 
}
