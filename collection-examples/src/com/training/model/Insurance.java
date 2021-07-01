package com.training.model;

public class Insurance {
	
	private String policyHolderName;
	private double policyAmount;
	
	public Insurance(String policyHolderName, double policyAmount) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double calculatePremium()
	{
		return 1000.00;
	}

}
