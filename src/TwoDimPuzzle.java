package TwoDimPuzzle;

import java.util.ArrayList;

public class TwoDimPuzzle {
		
	public static void main(String[] arg){
		
		int rows;
		int cols;
		char[][] map;
		ArrayList<String> words = new ArrayList<>();
		
		WordPuzzleChecker pSize = new WordPuzzleChecker();
		
		pSize.openFile();
		pSize.readFile();
		pSize.closeFile();
				
		cols = pSize.getCol();
		rows = pSize.getRow();
		map = new char[cols][rows];
				
		WordPuzzleReader puzzle = new WordPuzzleReader(rows, cols, map);
		
		//puzzle.setTable(rows, cols);

		puzzle.openFile();		// open input file
		puzzle.readFile();		// mapping puzzle
		puzzle.closeFile();		// close file
				
		map = puzzle.returnTable();
		words = puzzle.returnWords();
		puzzle.print();
		
		Address searchResult = new Address(rows, cols, map, words);
		searchResult.searchList();
		
		//f.search8();
				
	}	// main
}	// class
