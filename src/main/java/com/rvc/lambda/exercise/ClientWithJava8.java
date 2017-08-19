package com.rvc.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientWithJava8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Jack", "Jones", 34),
				new Person("Joe", "Root", 27),
				new Person("John", "Cena", 39),
				new Person("Steve", "Smith", 34)
				);
		
		// Sort the list by last name
		Comparator<Person> comparator = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		Collections.sort(persons, comparator);
		
		// Create a method that prints all elements in list
		System.out.println(persons);
		
		// Create a method that prints persons having last name beginning with C
	}
}
