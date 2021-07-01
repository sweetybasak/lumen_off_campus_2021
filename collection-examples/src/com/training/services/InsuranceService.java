package com.training.services;


import java.util.*;

import com.training.model.Insurance;
import com.training.model.LifeInsurance;

public class InsuranceService {

//	public void displayPolicy(List<? extends Insurance> list)
//	{
//		//List is a producer so we can pull elements from it
//		for(Insurance eachPolicy:list)
//		{
//			System.out.println(eachPolicy.calculatePremium());
//		}
//		//list is a producer so you cannot add elements
//		//list.add(new Insurance("Ramesh",100000));
//		
//	}
	
	
//	public void displayPolicy(List<? super LifeInsurance> list) {
//		System.out.println(list.add(new LifeInsurance("Gupta",56000,12)));
//		//list is a Consumer so we can pull elements from it
//		for(Object eachPolicy:list)
//		{
//			LifeInsurance insurance = (LifeInsurance)eachPolicy;
//			System.out.println(insurance.calculatePremium());
//		}
//		//list is a Consumer so you can call ADD element of Life Insurance type but not others
//		
//	}
	
	public void displayPolicy(List <? super LifeInsurance> list2)
	{
		list2.add(1,new LifeInsurance("Gupta",560000,12));
		for(Object eachPolicy:list2)
		{
			System.out.println(((LifeInsurance)eachPolicy).calculatePremium());
		}
	}
	
}

