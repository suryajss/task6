package com.demo.uppercase;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StudentGifts {

public static void main(String[] args) {
	List<String> students = Arrays.asList("anitha","prakash","anjali","dinesh","rubraj","adthi","akash","sanjay","abishek","shine");
	
	List<String> spicelStudents = students.stream()
			.filter(name -> name.startsWith("A"))
			.collect(Collectors.toList());
	System.out.println("Special students with names starting with 'A':");
	for(String students1 : students) {
		System.out.println(students1);
		
	}
}
}
