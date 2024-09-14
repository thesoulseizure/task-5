package Task5;


import java.util.stream.Collectors;
import java.util.stream.Stream;


// a program to using map method to convert list of strings into upperCase

public class QuestionOne {
	public static void main(String[] args) {
	
		// creating a stream of strings and using map method
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
				return s.toUpperCase();
			}).collect(Collectors.toList()));
	
	}

}
