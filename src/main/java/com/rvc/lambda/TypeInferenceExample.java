package com.rvc.lambda;

public class TypeInferenceExample {
	public static void main(String[] args) {
		StringLength stringLength = (inputString) -> inputString.length();
		System.out.println(stringLength.getLength("Rahul"));
	}
	
	interface StringLength {
		int getLength(String inputString);
	}
}
