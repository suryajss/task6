package com.demo.uppercase;
import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
		System.out.println("orijinal list :");
		System.out.print((strings));
		
		
		System.out.println("\nList with Non-Empty Strings:");
		for(String str : strings) {
			if(!str.isEmpty()) {
				System.out.println(str);		
		}
	}
}
}


