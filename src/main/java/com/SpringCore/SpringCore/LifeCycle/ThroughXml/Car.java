package com.SpringCore.SpringCore.LifeCycle.ThroughXml;

public class Car {
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
	 
	public void init() {
		System.out.println("Intialization done");
	}
	
	public void destroy(){
		System.out.println("Clean up done");
	}
	 
}
