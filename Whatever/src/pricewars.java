
import java.io.File;
import java.util.*;
public class pricewars {

	
	public static void main(String[] args)  throws Exception{
		
	Scanner scanny = new Scanner(new File("U:\\input.txt"));
	int line ;
	int count;
	line = scanny.nextInt(); //number of lines
	System.out.println(line);
	
	for(int i = 0; i < line; i++){   // for each line
		count = scanny.nextInt(); //number of costs on line
		int[] numbers = new int[count];  // create array that number
		for(int b = 0; b < count; b++){ // for each number on line
			numbers[b]= scanny.nextInt(); //write to array that pos
			System.out.println(numbers[b]); 
			for(int c = 0; b < count; c++){
				if ( numbers[c] == numbers[count - 1]){
					
			}
		}
		System.out.println("");
	}
	
	
	
	}

	}
