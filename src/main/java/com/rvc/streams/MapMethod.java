package com.rvc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {
	public static void main(String[] args) {
		
		System.out.println("***** MAP *****");
		
		Stream<String> singleStream = Stream.of("1", "2", "3", "4");
		List<Integer> integers = singleStream.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(integers);
		
		System.out.println("\n***** FLAT MAP *****");
		
		List<String> odds = Arrays.asList("1", "3", "5");
		List<String> evens = Arrays.asList("2", "4", "6");
		
		Stream<List<String>> multipleStreams = Stream.of(odds, evens);
		List<Integer> ints = multipleStreams.flatMap(list -> list.stream().map(Integer::valueOf)).collect(Collectors.toList());
		System.out.println(ints);
	}
}
