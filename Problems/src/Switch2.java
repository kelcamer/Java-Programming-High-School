	/*
	 * Kelsey Cameron
	 */
import java.util.*;
public class Switch2 {


	public static void main(String[] args) {
		
		Scanner scanny = new Scanner(System.in);
		int grades = 0;
		int score = 0;
		System.out.println("How many grades would you like to enter?");
		grades = scanny.nextInt();
		
		
		for(int n = 0; n < grades; n++){
			System.out.println("Please enter your score:");
			score = scanny.nextInt();
			
			switch(score){
			
			case 1: System.out.println("Retake the exam.");
			break;
			case 2: System.out.println("You failed.");
			break;
			case 3: System.out.println("You passed!");
			break;
			case 4: System.out.println("Nice!");
			break;
			case 5: System.out.println("You rock!");
			break;
				
				
				
				
				
				
			}
			
			
		}
		}
		

	}


