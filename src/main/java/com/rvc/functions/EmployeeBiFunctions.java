package com.rvc.functions;

import java.util.function.BiFunction;

public class EmployeeBiFunctions {
	
	public static BiFunction<Employee, Employee, String> concatenateEmployeesName() {
		return (emp1, emp2) -> emp1.getFirstName() + " " + emp1.getLastName() + " | " + emp2.getFirstName() + " " + emp2.getLastName();
	}
	
	public static BiFunction<Employee, Employee, String> concatenateEmployeesAge() {
		return (emp1, emp2) -> "" + emp1.getAge() + " | " + emp2.getAge();
	}
	
	public static BiFunction<Employee, Employee, String> concatenateEmployeesGender() {
		return (emp1, emp2) -> emp1.getGender() + " | " + emp2.getGender();
	}
}
