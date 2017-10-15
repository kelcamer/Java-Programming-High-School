	/*
	 * Kelsey Cameron
	 */
import java.util.*;


public class Pythagorean {

	public static void main(String[] args) {
	
	double xnum1;
	double xnum2;
	double ynum1;
	double ynum2;
	double length;
	
	System.out.println("Please enter the first two x values of the point, press enter, and then enter the next two y values.");
	Scanner scanny = new Scanner(System.in);
	xnum1 = scanny.nextInt();
	xnum2 = scanny.nextInt();
	ynum1 = scanny.nextInt();
	ynum2 = scanny.nextInt();
	
	length = Math.pow(Math.pow((ynum2 - ynum1), 2) + Math.pow((xnum2 - xnum1), 2), 0.5);
	System.out.println(length);
	// input
	// (1,2) (3,4)
	
			
	}
}
