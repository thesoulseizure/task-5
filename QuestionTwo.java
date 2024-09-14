package Task5;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;



// a program to check whether the strings in the list are empty or not


public class QuestionTwo {
	public static void main(String[] args) {
		
		// creating a list of strings
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		System.out.println("List : " +strings);
		
		// using count method to check the list is empty or not
		 
		long count = strings.stream().filter(string -> string.isEmpty()).count();
	      
	    System.out.println("Empty Strings: " + count);
	    
	    // using filter method to get non empty list of strings
		 
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println("Filtered List: " + filtered);
		
		
	}

}
