/**
	 Kelsey Cameron
	 12/13/12
	 */

import java.util.*;
public class Switchstatement1 {

	
	public static void main(String[] args) {

		System.out.println("Please enter your score:");
		Scanner scanny = new Scanner(System.in);
		
		int number = 1;
		number = scanny.nextInt();
		switch(number){
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
