package quizzes;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year = 0;
		Scanner input = new Scanner(System.in); //Scanner object
		
		
		while (year != -1) {
		System.out.println("\n" + "Please enter a year "
				+ "as an integer on or after 1582: \n" +
				"Enter -1 to exit. ");
		year = input.nextInt(); 
	
		
		if (year >= 1582) {//check if year is after 1582
			
			
			if (year%4 == 0 && year%100 != 0 || // year is divisible by 4 and not 100
					year%100 == 0 && year%400 == 0) {// year is divisible by 100 and 400
			System.out.println("Year is a leap year");
			}
			
			else {
				System.out.println("Year is not a leap year");
			}
		}
		
		
		else if (year == -1) {// if user wants to exit
			input.close();
			return;
		}
		else {// if year is before 1582
			System.out.println("Error");
			}
		}
		input.close();
	}
}
