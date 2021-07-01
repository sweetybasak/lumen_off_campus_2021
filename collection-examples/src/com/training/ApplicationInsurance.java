package com.training;
import java.util.*;

import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;
import com.training.services.InsuranceService;
public class ApplicationInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LifeInsurance> list = Arrays.asList(new LifeInsurance("Ramesh",80000,27),
				new LifeInsurance("Ramesh",80000,14));
		List<LifeInsurance> lifelist = new ArrayList<>();
		lifelist.add(new LifeInsurance("Ramesh",80000,27));
		lifelist.add(new LifeInsurance("Ramesh",70000,18));
//		List<LifeInsurance> lifeList = Arrays.asList(new LifeInsurance("Ramesh",80000,27),
//				new LifeInsurance("Ramesh",80000,14));
//		
		List<VehicleInsurance> vehicleList = Arrays.asList(new VehicleInsurance("Naveen",70000,"car"),
				new VehicleInsurance("Bala",70000,"twowheeler"));
		
		InsuranceService insurance = new InsuranceService();
		insurance.displayPolicy(lifelist);
		//insurance.displayPolicy(vehicleList);
				
	}

}
