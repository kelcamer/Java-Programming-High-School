import java.util.*;
import java.io.*;

public class appliances {

	public static void main(String[] args) throws Exception{
		Scanner scanny=new Scanner(new File("U:\\program.txt"));
		int n; 
		String g;
		int retail;
		int m;

		
		n = scanny.nextInt(); /* # of Appliances*/
		
	for(int i = 0; i < n; i++){
		g = scanny.next(); /* Name */
	  	retail = scanny.nextInt(); /* retail*/
	m = scanny.nextInt(); /* # of prices*/
	
	System.out.println("Appliance " + g + ":");
	for(int d = 0; d < m; d++){
		int price = scanny.nextInt();
		
		if (price < retail)
				System.out.println("I love appliances!");

		if (price > retail)
			System.out.println("You paid too much!");

		if (price == retail)
			System.out.println("Wakkie Nu Nu!");
		
		
	/*	System.out.println("Appliance " + g);
		System.out.println("Appliance " + retail); */
	
	
				}	
	System.out.println("");
			}
	
	}
}
		



