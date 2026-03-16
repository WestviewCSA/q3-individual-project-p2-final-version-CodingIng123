//this class is for the character going through da map

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
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
					//System.out.print(values[i][j]);
				}
				//System.out.println();

			}
			
			Queue<Integer> rows = new LinkedList<Integer>();
			Queue<Integer> columns = new LinkedList<Integer>();
			Queue<String> value = new LinkedList<String>();
			Queue<Integer> traveledRows = new LinkedList<Integer>();
			Queue<Integer> traveledColumns = new LinkedList<Integer>();
			Queue<String> traveledValues = new LinkedList<String>();
			
			boolean win = false;				
				for (int i = 0; i < values.length; i++) {
					for(int j = 0; j < values[0].length; j++) {
						if (values[i][j].equals("W")) {
							int wolverineX = i;
							int wolverineY = j;
							System.out.println(wolverineX + " " + wolverineY);						
						}
							 
					}
				}
				
				
				
			
			
			
		
		
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}


	
	
	
	