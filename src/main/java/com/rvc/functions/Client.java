package com.rvc.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author s750528
 *
 */
public class Client {
	public static void main(String[] args) {
		
		System.out.println("*** Function ***");
		
		/**
		 * @FunctionalInterface 
			public interface Function<T, R>{ 
				R apply(T t);
			}
		 */
		Employee employee = new Employee(1, 19, "Male", "Rafael", "Nadal");
		
		Function<Employee, String> name = EmployeeFunctions.getEmployeeName();
		System.out.println(name.apply(employee));
		
		Function<Employee, Integer> age = EmployeeFunctions.getEmployeeAge();
		System.out.println(age.apply(employee));
		
		Function<Employee, String> gender = EmployeeFunctions.getEmployeeGender();
		System.out.println(gender.apply(employee));
		
		System.out.println("*** Bi Function ***");
		/**
		 * @FunctionalInterface
			public interface BiFunction<T, U, R> {
     			R apply(T t, U u);
			}
		 */
		
		Employee employee1 = new Employee(1, 19, "Male", "Rafael", "Nadal");
		Employee employee2 = new Employee(2, 24, "Male", "Roger", "Federer");
		
		BiFunction<Employee, Employee, String> concatenatedName = EmployeeBiFunctions.concatenateEmployeesName();
		System.out.println(concatenatedName.apply(employee1, employee2));
		
		BiFunction<Employee, Employee, String> concatenatedAge = EmployeeBiFunctions.concatenateEmployeesAge();
		System.out.println(concatenatedAge.apply(employee1, employee2));
		
		BiFunction<Employee, Employee, String> concatenatedGender = EmployeeBiFunctions.concatenateEmployeesGender();
		System.out.println(concatenatedGender.apply(employee1, employee2));
	}
}
