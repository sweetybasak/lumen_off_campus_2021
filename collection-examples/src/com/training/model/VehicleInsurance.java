package com.training.model;

public class VehicleInsurance extends Insurance{

	private String vehicleModel;

	@Override
	public double calculatePremium() {
		double premium =1200;
		if(vehicleModel.equalsIgnoreCase("twowheeler"))
			premium = 600;
		return premium;
	}

	public VehicleInsurance(String policyHolderName, double policyAmount, String vehicleModel) {
		super(policyHolderName, policyAmount);
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	
}
