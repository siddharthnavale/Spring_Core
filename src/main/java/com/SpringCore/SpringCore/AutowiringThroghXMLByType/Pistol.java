package com.SpringCore.SpringCore.AutowiringThroghXMLByType;

public class Pistol {
	
	private int noOfBullets;
	private boolean isLoadingRequire;
	

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
