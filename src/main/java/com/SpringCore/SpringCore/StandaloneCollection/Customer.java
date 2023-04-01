package com.SpringCore.SpringCore.StandaloneCollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	

	private List <String> items;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(List<String> items) {
		super();
		this.items = items;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Customer [item=" + items + "]";
	}
	

	

}
