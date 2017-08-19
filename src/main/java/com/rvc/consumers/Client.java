package com.rvc.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author s750528
 *
 */
public class Client {
	public static void main(String[] args) {
		
		System.out.println("*** Consumers ***");
		
		/**
		 * @FunctionalInterface 
			public interface Consumer<T>{ 
				void accept(T t); 
			}
		 */
		
		Employee emp1 = new Employee(1, 19, "Male", "Rafael", "Nadal");
		Employee emp2 = new Employee(2, 22, "Female", "Martina", "Hingis");
		Employee emp3 = new Employee(3, 16, "Female", "Maria", "Sharapova");
		Employee emp4 = new Employee(4, 28, "Male", "Roger", "Federer");
		Employee emp5 = new Employee(5, 22, "Male", "Novac", "Djokovic");
		
		List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
		
		System.out.println("NAMES : ");
		employees.forEach(EmployeeConsumers.printName());
		System.out.println("***************");
		System.out.println("AGES :");
		employees.forEach(EmployeeConsumers.printAge());
		System.out.println("********");
		System.out.println("GENDERS : ");
		employees.forEach(EmployeeConsumers.printGender());
		
		Consumer<Employee> consumer = EmployeeConsumers.printName();
		System.out.println("*****************");
		System.out.println("Consumer Accept : ");
		consumer.accept(emp1);
		
		System.out.println("******************");
		System.out.println("Consumer AndThen : ");
		consumer.andThen(consumer).accept(emp2);
		
		System.out.println("*** BiConsumers ***");
		
		/**
		 * @FunctionalInterface
			public interface BiConsumer<T, U> {
     			void accept(T t, U u);
     			// andThen default method is defined
			}
		 */
		EmployeeBiConsumers.printFirstAndLastName().accept("Roger", "Federer");
		EmployeeBiConsumers.printFirstNameAndAge().accept("Roger", 30);
		EmployeeBiConsumers.printFirstNameAndGender().accept("Roger", "Male");
	}
}
