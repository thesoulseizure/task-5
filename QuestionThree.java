package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionThree {
	public static void main(String[] args) {
		
		// using a list to store student names
		
		  List<String> studentList = Arrays.asList("Ashish", "Dinesh", "Pradeep", "Laxman", "Aravind", "Mohan", "Aaliya", "Nithin", "Abhinav", "Ramesh");
		  
		  // using lambda expression and stream to filter the students starting with "A
		  
		  List<String> giftsNameList = studentList.stream() .filter(name -> name.startsWith("A")).collect(Collectors.toList());
		  giftsNameList.forEach(System.out::println);
	}

}
