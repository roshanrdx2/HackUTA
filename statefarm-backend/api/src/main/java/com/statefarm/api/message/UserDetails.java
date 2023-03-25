package com.statefarm.api.message;

public class UserDetails {
	String dob;
	String sex;
	String isSmoker;
	int height;
	int weight; 
	long coverageAmount;
	int coverageTerm;
	String health;
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getIsSmoker() {
		return isSmoker;
	}
	public void setIsSmoker(String isSmoker) {
		this.isSmoker = isSmoker;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public long getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(long coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	public int getCoverageTerm() {
		return coverageTerm;
	}
	public void setCoverageTerm(int coverageTerm) {
		this.coverageTerm = coverageTerm;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
}
