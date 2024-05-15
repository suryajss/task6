package com.demo.uppercase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Uppercaseconverter {
	public static void main(String[] args) {
		Stream<String> streamnames = Stream.of("ABC", "d", "ef");
		
		List<String> uppercaselist = streamnames
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(uppercaselist);
	}

}
