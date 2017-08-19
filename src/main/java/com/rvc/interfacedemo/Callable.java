package com.rvc.interfacedemo;

public interface Callable {
	void dialNumber();
	
	static void add() {}
	
	default void receiveCall() {
		System.out.println("Receiving call.");
	}
}
