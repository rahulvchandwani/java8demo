package com.rvc.functions;

import java.util.function.Function;

public class EmployeeFunctions {
	
	public static Function<Employee, String> getEmployeeName() {
		return emp -> emp.getFirstName() + " " + emp.getLastName();
	}
	
	public static Function<Employee, Integer> getEmployeeAge() {
		return emp -> emp.getAge();
	}
	
	public static Function<Employee, String> getEmployeeGender() {
		return emp -> emp.getGender();
	}
}
