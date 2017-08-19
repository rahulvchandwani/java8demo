package com.rvc.predicates;

import java.util.Arrays;
import java.util.List;

/**
 * @author s750528
 *
 */
public class Client {
	public static void main(String[] args) {
		
		System.out.println("*** Predicates ***");
		
		/**
		 * @FunctionalInterface 
			public interface Predicate<T>{ 
				Boolean test(T t); 
			}
		 */
		
		Employee emp1 = new Employee(1, 19, "Male", "Rafael", "Nadal");
		Employee emp2 = new Employee(2, 22, "Female", "Martina", "Hingis");
		Employee emp3 = new Employee(3, 16, "Female", "Maria", "Sharapova");
		Employee emp4 = new Employee(4, 28, "Male", "Roger", "Federer");
		Employee emp5 = new Employee(5, 22, "Male", "Novac", "Djokovic");
		
		List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultFemale()));
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(19)));
		
		System.out.println("*** Bi Predicates ***");
		
		/**
		 * @FunctionalInterface
			public interface BiPredicate<T, V> {
       			public boolean test (T t, V v);
			}
		 */
		
		System.out.println(EmployeeBiPredicates.isAdultMale().test(22, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultMale().test(20, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultMale().test(22, "Female"));
		System.out.println(EmployeeBiPredicates.isAdultMale().test(20, "Female"));
		
		System.out.println("********************");
		
		System.out.println(EmployeeBiPredicates.isAdultMaleWithAndFunction().test(22, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultMaleWithAndFunction().test(20, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultMaleWithAndFunction().test(22, "Female"));
		System.out.println(EmployeeBiPredicates.isAdultMaleWithAndFunction().test(20, "Female"));
		
		System.out.println("********************");
		
		System.out.println(EmployeeBiPredicates.isAdultFemale().test(19, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultFemale().test(17, "Male"));
		System.out.println(EmployeeBiPredicates.isAdultFemale().test(19, "Female"));
		System.out.println(EmployeeBiPredicates.isAdultFemale().test(17, "Female"));
	}
}
