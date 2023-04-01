package com.SpringCore.SpringCore.AutowiringThroghXMLByConstructor;

public class Pistol {
	
	private int noOfBullets;
	private boolean isLoadingRequire;
	

	public Pistol() {
		
	}
	
	public Pistol(int noOfBullets, boolean isLoadingRequire) {
		super();
		this.noOfBullets = noOfBullets;
		this.isLoadingRequire = isLoadingRequire;
	}

	public int getNoOfBullets() {
		return noOfBullets;
	}
	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}
	public boolean getIsLoadingRequire() {
		return isLoadingRequire;
	}
	public void setIsLoadingRequire(boolean isLoadingRequire) {
		this.isLoadingRequire = isLoadingRequire;
	}
	@Override
	public String toString() {
		return "Pistol [noOfBullets=" + noOfBullets + ", isLoadingRequire=" + isLoadingRequire + "]";
	}
	
	
	
	
	

}
