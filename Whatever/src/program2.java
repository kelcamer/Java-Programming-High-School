import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class program2 {
	public static void main(String[] args){
		Scanner scanny =  new Scanner(System.in) ;
		
		String name1;
		
		name1 = scanny.nextLine();
		
		
		
		List<String> items = Arrays.asList(name1.split("\\s*,\\s*"));
		System.out.println("Monsieur " + items + "!!!!");
	}
}