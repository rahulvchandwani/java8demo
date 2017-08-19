package com.rvc.consumers;

import java.util.function.Consumer;

public class EmployeeConsumers {
	
	public static Consumer<Employee> printName() {
		return emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName());
	}
	
	public static Consumer<Employee> printAge() {
		return emp -> System.out.println(emp.getAge());
	}
	
	public static Consumer<Employee> printGender() {
		return emp -> System.out.println(emp.getGender());
	}
	
}
