import java.util.*;
public class switchproj {
	public static void main(String[] args) {

		Scanner scanny =  new Scanner(System.in) ;
		String strchar;
				strchar = scanny.nextLine();
		char process = strchar.charAt(0);
		
		//		char process = strchar.charAt(0);
		char letter = process;
		switch(letter){
		case 'A':System.out.println("You did well");
		break;    
		case 'B':System.out.println("Good job");
		case 'C':System.out.println("Good job");
		case 'D':System.out.println("Good job");
		default: System.out.println("ERROR");
		
		}
		
	}

}
