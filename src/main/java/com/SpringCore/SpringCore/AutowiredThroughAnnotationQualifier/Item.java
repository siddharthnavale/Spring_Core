package com.SpringCore.SpringCore.AutowiredThroughAnnotationQualifier;

public class Item {
	
	private String ItemName;

	public Item() {
		super();
	}

	public Item(String itemName) {
		super();
		ItemName = itemName;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	@Override
	public String toString() {
		return "Cart [ItemName=" + ItemName + "]";
	}
	
	
	

}
