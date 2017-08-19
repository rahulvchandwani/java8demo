package com.rvc.interfacedemo;

public class Phone implements Callable {

	@Override
	public void dialNumber() {
		System.out.println("Dialing a number.");
	}

}
