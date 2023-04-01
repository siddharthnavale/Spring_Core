package com.SpringCore.SpringCore;

public class Employee {
	
	private int employeeId;
	private String emlpoyeeName;
	private String jobRole;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String emlpoyeeName, String jobRole) {
		
		this.employeeId = employeeId;
		this.emlpoyeeName = emlpoyeeName;
		this.jobRole = jobRole;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmlpoyeeName() {
		return emlpoyeeName;
	}

	public void setEmlpoyeeName(String emlpoyeeName) {
		this.emlpoyeeName = emlpoyeeName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emlpoyeeName=" + emlpoyeeName + ", jobRole=" + jobRole + "]";
	}
	

}
