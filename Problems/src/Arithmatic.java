// Kelsey Cameron
import java.util.*;
public class Arithmatic {

	public static void main(String[] args){
		System.out.println("Please type in two numbers:");
		Scanner scanny = new Scanner(System.in);
		double var1, var2, num1;
		var1 = scanny.nextDouble();
		var2 = scanny.nextDouble();
		scanny.nextLine();
		String userinput = "";
		System.out.println("Do you want to add, subtract, multiply, divide, or average the numbers?");
		userinput = scanny.nextLine();
		if (userinput.equals ("add"))
			System.out.println(add(var1, var2));
		else if (userinput.equals("subtract"))
			System.out.println(subtract(var1, var2));
		else if (userinput.equals ("multiply"))
			System.out.println(multiply(var1, var2));
		else if (userinput.equals ("divide")){
			if (var2 == 0){
				System.out.println("You cannot divide by zero.  Please type in a new number, you idiot.");
				var2 = scanny.nextDouble();
			}
			System.out.println(divide(var1, var2));
		}
		else if (userinput.equals("average")){
			int n;
			System.out.println("How many numbers do you want to enter?");
			n = scanny.nextInt();
			double[]array = new double[n];
			System.out.println(average(array[n]));
			
				
				
			}
			
		}
	
	public static double add(double a, double b){
		double c;
		c = a + b;
		return c;
	}
	public static double subtract(double a, double b){
		double c;
		c = a - b;
		return c;
	}
	public static double multiply(double a, double b){
		double c;
		c = a * b;
		return c;
	}
	public static double divide(double a, double b){
		double c;
		c = a / b;
		return c;
	}
	public static double average(double[] b){
		Scanner scanny = new Scanner(System.in);
		double num1 = 0.0;
		double sum = 0.0;
		double average;
		for(int x = 0; x < b.length; x++){
			System.out.println("Enter your numbers!");
			num1 = scanny.nextDouble();
			sum = sum + num1;
			
	}
		average = sum / b.length;
		return average;
	}
	
}
