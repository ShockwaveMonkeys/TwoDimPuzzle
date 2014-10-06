/*
 * Created: 		Oct 05, 2014
 * Last modified:	Oct 06, 2014
 * Team name: 		ShockwaveMonkeys
 * Author: 			Lynn Longboy, Younggun Chung
 * Project:			Two Dimensional Letter Puzzle V2
 * 
 * purpose:			main
 * 
 */


package TwoDimPuzzle;

import java.util.ArrayList;

public class TwoDimPuzzle {
		
	public static void main(String[] arg){
		
		int rows;
		int cols;
		char[][] map;
		ArrayList<String> words = new ArrayList<>();
		
		/* 
		 * Recognize the size of puzzle
		 */
		WordPuzzleChecker pSize = new WordPuzzleChecker();
		
		pSize.openFile();
		pSize.readFile();
		pSize.closeFile();
				
		/*
		 * Setup the puzzle size
		 */
		cols = pSize.getCol();
		rows = pSize.getRow();
		map = new char[cols][rows];
				
		/*
		 * Store puzzle map and words
		 */
		WordPuzzleReader puzzle = new WordPuzzleReader(rows, cols, map);
		
		puzzle.openFile();		// open input file
		puzzle.readFile();		// mapping puzzle
		puzzle.closeFile();		// close file
				
		map = puzzle.returnTable();
		words = puzzle.returnWords();
		//puzzle.print();
		
		/*
		 * Search 8 directions, and Print results
		 */
		Address searchResult = new Address(rows, cols, map, words);
		searchResult.searchList();
				
	}	// main
}	// class
