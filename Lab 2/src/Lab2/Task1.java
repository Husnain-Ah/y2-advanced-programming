package Lab2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year; int month; int day;
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the year of your birthday: ");
		int a = Input.nextInt();
		year = a;
		
		System.out.println("Enter the month of your birthday: ");
		int b = Input.nextInt();
		month = b;
		
		System.out.println("Enter the day of your birthday: ");
		int c = Input.nextInt();
		day = c;
		
		Input.close();
		
		LocalDate currentDate = LocalDate.now();
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		
	    System.out.println("It is now " + currentDate);
	    
	    System.out.println("Your birth day was " + birthDate);
	    
	    System.out.println(getAge(birthDate, currentDate)); }
	    
	    
	    public static String getAge(LocalDate birthDate, LocalDate currentDate) {
	    	if ((birthDate != null) && (currentDate != null)){
	    		int age = Period.between(birthDate, currentDate).getYears();
	            System.out.println(age);
	            
	    	    if (age < 16) {
	    	    	System.out.println("Your next milestone birthday is 16.");
	    	    }
	    	    else if (age < 18) {
	    	    	System.out.println("Your next milestone birthday is 18.");
	    	    }
	    	    else if (age < 21) {
	    	    	System.out.println("Your next milestone birthday is 21.");
	    	    }
	    	    else if (age < 30) {
	    	    	System.out.println("Your next milestone birthday is 30.");
	    	    }
	    	    else if (age < 40) {
	    	    	System.out.println("Your next milestone birthday is 40.");
	    	    }
	    	    else if (age < 50) {
	    	    	System.out.println("Your next milestone birthday is 50.");
	    	    }
	    	    else if (age < 60) {
	    	    	System.out.println("Your next milestone birthday is 60.");
	    	    }
	    	    else if (age < 70) {
	    	    	System.out.println("Your next milestone birthday is 70.");
	    	    }
	    	    else if (age < 80) {
	    	    	System.out.println("Your next milestone birthday is 80.");
	    	    }
	    	    else if (age < 90) {
	    	    	System.out.println("Your next milestone birthday is 90.");
	    	    }
	    	    else if (age < 100) {
	    	    	System.out.println("Your next milestone birthday is 100.");
	    	    } 
	    	    else {
	    	    	System.out.println("You are too old just die already.");
	    	    }
	    	}
	    	return null;
	    	
	    
	     


	}
}
