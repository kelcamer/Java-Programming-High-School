import java.util.*;


public class Converge {

	/**
	 * Kelsey Cameron's Epic Converge or Diverge Program
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a function.");
		Scanner scanny =  new Scanner(System.in) ;
		pseries(scanny.nextLine());
		
		

	}





public static boolean pseries(String num1){
	
	boolean yes = false;
	num1 = num1.replaceAll("1/xabcdefghijklmnopqrxtuvwxyz ", "");
	int n = 0;
	n = Integer.parseInt(num1.toString());
	if (num1 =="")
		System.out.println("The function diverges.");
	else if (n <= 1)
		System.out.println("The function diverges.");
	else if (n > 1)
		System.out.println("The function converges! Yay!");
	else
		System.out.println("The P-series test is inconclusive. Sorry.");
		
		
	
	return yes;
	
}




}