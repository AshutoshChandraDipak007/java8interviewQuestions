package com.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 'f','o', 'r', 'G', 'e', 'e', 'k', 's');		
	    String srt=	ch.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(srt);
		
		 // Create a string list
        List<String> str = Arrays.asList("Geeks", "for", "Geeks");
 
        // Convert the string list into String
        // using Collectors.joining() method
        String chString = str.stream().collect(Collectors.joining(", ", " {", "} ")); 
        // Print the concatenated String
        System.out.println(chString);
	}

}
