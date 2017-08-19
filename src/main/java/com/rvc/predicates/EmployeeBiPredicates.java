package com.rvc.predicates;

import java.util.function.BiPredicate;

public class EmployeeBiPredicates {
	
	public static BiPredicate<Integer, String> isAdultMale() {
		return (age, gender) -> age > 21 && gender.equals("Male");
	}
	
	public static BiPredicate<Integer, String> isAdultMaleWithAndFunction() {
		BiPredicate<Integer, String> ageBiPredicate = (age, gender) -> age > 21;
		BiPredicate<Integer, String> genderBiPredicate = (age, gender) -> gender.equals("Male");
		return ageBiPredicate.and(genderBiPredicate);
	}
	
	public static BiPredicate<Integer, String> isAdultFemale() {
		return (age, gender) -> age > 18 && gender.equals("Female");
	}
	
}
