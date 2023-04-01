package com.SpringCore.SpringCore.RefType;

public class Student {
	
	private int rollNumber;
	private String name;
	private int std;
	private Address address;
	
	
	public Student() {
		
	}

	public Student(int rollNumber, String name, int std, Address address) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.std = std;
		this.address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", std=" + std + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
