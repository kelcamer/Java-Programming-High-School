import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*	Kelsey Cameron
 * 	April 4, 2013
 */
public class race {

	
	public static void main(String[] args) throws FileNotFoundException{
	
		File f = new File("E:\\Java\\input.txt");
		Scanner scanny = new Scanner(f);
		int total = 0;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		total = scanny.nextInt();
		
		for (int a = 0; a < total; a++){
			
			
			x1 = scanny.nextInt();
			y1 = scanny.nextInt();
		
			x2 = scanny.nextInt();
			y2 = scanny.nextInt();
			
		
		
		if (x1 == x2){
			System.out.println("It's all good.");
		
		}
		else if (y1 == y2){
			System.out.println("It's all good.");
		
		}
		else {
			System.out.println("We need to fix this");
		}
	
	}
	
	
	}
	
	
}
