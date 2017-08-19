package com.rvc.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientWithJava7 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Jack", "Jones", 34),
				new Person("Joe", "Root", 27),
				new Person("John", "Cena", 39),
				new Person("Steve", "Smith", 34)
				);
		
		// Sort the list by last name
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		//Comparator<Person> cmp = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		// Create a method that prints all elements in list
		
		// Create a method that prints persons having last name beginning with C
	}
}
