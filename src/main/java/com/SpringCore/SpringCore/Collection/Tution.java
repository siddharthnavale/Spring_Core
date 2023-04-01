package com.SpringCore.SpringCore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tution{
	
	private String Name;
	private List<String> phoneNumber;
	private Set <String> addresses;
	private Map <String,String> courses;
	
	public Tution() {
	
	}

	public Tution(String name, List<String> phoneNumber, Set<String> addresses, Map<String, String> courses) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
		this.addresses = addresses;
		this.courses = courses;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	

}
