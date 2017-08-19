package com.rvc.consumers;

import java.util.function.BiConsumer;

public class EmployeeBiConsumers {
	
	public static BiConsumer<String, String> printFirstAndLastName() {
		return (firstName, lastName) -> System.out.println(firstName + " | " + lastName);
	}
	
	public static BiConsumer<String, Integer> printFirstNameAndAge() {
		return (firstName, age) -> System.out.println(firstName + " | " + age);
	}
	
	public static BiConsumer<String, String> printFirstNameAndGender() {
		return (firstName, gender) -> System.out.println(firstName + " | " + gender);
	}
}
