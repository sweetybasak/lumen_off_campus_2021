package com.training;

import com.training.tasks.SumNumberTask;

public class TestSumNumberTask {

	public static void main(String[] args) {
		
		//superType = subtype => call
		Runnable countToFive = new SumNumberTask(5);
		Thread t1 = new Thread(countToFive,"Five Count");
		Runnable countToTen = new SumNumberTask(10);
		Thread t2 = new Thread(countToTen,"Ten Count");
		
		t1.start(); //runnable
		t2.start(); //runnable
		
		//only done for understanding
		//- run() method should not be called this way
		//Runnable countToHundred = new SumNumberTask(100);
		//countToHundred.run();

		
		
		

	}

}
