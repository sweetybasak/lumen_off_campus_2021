package com.training.model;

public class LifeInsurance extends Insurance{
	
	private int age;

	public LifeInsurance(String policyHolderName, double policyAmount, int age) {
		super(policyHolderName, policyAmount);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 2500;
		if(age>25)
			premium = 4000.00;
		return premium;
	}
	
}
