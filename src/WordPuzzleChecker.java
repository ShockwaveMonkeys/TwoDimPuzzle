/*
 * Created: 		Oct 05, 2014
 * Last modified:	Oct 06, 2014
 * Team name: 		ShockwaveMonkeys
 * Author: 			Younggun Chung 
 * Project:			Two Dimensional Letter Puzzle V2
 * 
 * purpose:			Checking the puzzle size from input.txt
 * 
 */


package TwoDimPuzzle;

import java.io.File;
//import java.util.ArrayList;
import java.util.Scanner;


public class WordPuzzleChecker {
	private Scanner readSize;
	private int rowSize;
	private int colSize;
	//private char[][] puzzleSize;
	
	
	/*
	 * Constructor
	 */
	public WordPuzzleChecker(){
//		this.rowSize = rowSize;
//		this.colSize = colSize;
		//this.puzzleSize = puzzleSize;	
	}
	
	
	/*
	 * Open files within project
	 */
	public void openFile(){
		
		try{
			readSize = new Scanner(new File("input.txt"));
		}
		catch(Exception e){
			System.out.println("File does not exist ");
		}
	}
	
	
	/*
	 * Reads File line by line until it gets to the last line of words to search
	 */
	public void readFile(){
		int colCount = 1;		// column
		int rowCount = 0;
		String line;		// read line;
		
		line = readSize.nextLine();
		rowCount = (line.length() / 2) + 1;
			
		while(readSize.hasNextLine()){
			line = readSize.nextLine();
			
			if(line.length() == 0){
				break;
			}
			
			++colCount;
		}	// while
		
		this.colSize = colCount;
		this.rowSize = rowCount;
		
	}
	
	
	/*
	 * Closes text file 
	 */
	public void closeFile(){
		readSize.close();
	}
	
	
	/*
	 * get row and col
	 */
	public int getRow(){
		return rowSize;
	}
	
	public int getCol(){
		return colSize;
	}
	
	
}	// class
