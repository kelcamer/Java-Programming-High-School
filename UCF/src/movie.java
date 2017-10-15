/*	Kelsey Cameron	*/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;
public class movie {

	public static void main(String[] args) throws FileNotFoundException{
		int userinput = 0;
		int numofDVD = 0;
		String data[] = null;
		File f = new File("E:\\input.txt");
		Scanner scanny = new Scanner(f);
		userinput = scanny.nextInt();
		numofDVD = scanny.nextInt();
		
		
		for (int x = 0; x < numofDVD; x++){
		data[x] = scanny.nextLine();			
		data[x] = data[x].replace("The", "");
		int numofalphabet = 26;
		char[] chararray = data[x].toCharArray();
		
	
			
		switch(chararray[1]){
		case 'a': System.out.println(data[x]);
		break;
		
		}
		
	
		
		// the string
		// data[x] 
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
