package com.rvc.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {
	
	public static Predicate<Employee> isAdultMale() {
		return emp -> emp.getAge() > 21 && emp.getGender().equals("Male");
	}
	
	public static Predicate<Employee> isAdultFemale() {
		return emp -> emp.getAge() > 18 && emp.getGender().equals("Female");
	}
	
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return emp -> emp.getAge() > age;
	}
	
	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.toList());
	}
}
