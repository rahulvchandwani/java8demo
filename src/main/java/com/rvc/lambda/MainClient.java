package com.rvc.lambda;

public class MainClient {
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World from Lambda !!!");
		
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello World from Inner Class !!!");
			}
		};
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}
}
