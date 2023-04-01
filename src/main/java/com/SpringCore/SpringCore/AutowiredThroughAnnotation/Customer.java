package com.SpringCore.SpringCore.AutowiredThroughAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	@Autowired
	private Item item;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer( Item item) {
		super();
		
		this.item = item;
	}

	
	public Item getCart() {
		return item;
	}
	public void setCart(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Customer [cart=" + item + "]";
	}
	
	

}
