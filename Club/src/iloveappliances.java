import java.util.*;
import java.io.*;
public class iloveappliances {

	/**
	 * Kelsey Cameron
	 * Why does Java always misspell my name?
	 * January 10, 2013
	 */
	public static void main(String[] args) throws Exception{


		int totalnum = 0;
		String name = "";
		int retail = 0;
		int numofmodels = 0;
		int itemprice = 0;
		File f = new File("E:\\appliances.txt");
		Scanner scanny = new Scanner(f);
	
		
		totalnum = scanny.nextInt();
		
		for (int x = 0; x < totalnum; x++ ){
			
	    name = scanny.next();
		retail = scanny.nextInt();
		
		numofmodels = scanny.nextInt();
		
			for (x = 0; x < numofmodels; x++){
				
				System.out.println("Appliance " + name + ":");
				itemprice = scanny.nextInt();
				if (itemprice < retail){
					System.out.println("I love appliances!!!");
				}
				else if (itemprice > retail){
					System.out.println("You paid too much.");
				}
				else if (itemprice == retail){
					System.out.println("Wakkie Nu Nu!");
				}
				
				
				
				
			}
			
			
		
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
