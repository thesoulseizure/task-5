package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class QuestionFour {
	public static void main(String[] args) {
		
		
		// taking date of birthday as input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthdate(yyyy-mm-dd) : ");
		int year = sc.nextInt();
		
		int month = sc.nextInt();
		
		int date = sc.nextInt();
		
		
		// using java.time.LocalDate class to calculate the age

        LocalDate dob = LocalDate.of(year, month, date);  

        LocalDate curDate = LocalDate.now();  
 
        Period period = Period.between(dob, curDate);  
 
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
}  
}  