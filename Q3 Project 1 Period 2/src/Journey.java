//this class is for the character going through da map

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Journey {
	
	public static void main(String[] args) {
		
		File map = new File("easy_map_1");
		
		try {
			Scanner s = new Scanner(map);
			
			int column = Integer.parseInt(s.next());
				//System.out.println(column);
			int row = Integer.parseInt(s.next());	
				//System.out.println(row);
			int rooms = Integer.parseInt(s.next());	
				//System.out.println(rooms);
			String[][] values = new String[row*rooms][column];
			
			for(int i = 0; i < values.length; i++) {
				String word = s.next();
				for (int j = 0; j < values[0].length; j++) { 
					values[i][j] = word.substring(j,j+1);
					System.out.print(values[i][j]);
					
				}
				System.out.println();

			}
		
		
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}


	
	
	
	