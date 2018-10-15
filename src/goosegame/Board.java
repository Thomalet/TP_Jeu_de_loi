package goosegame;

public abstract class Board {
	final int nbOfCells = 0;
	Cell[] theCells;
	
	public Board(int nbOfCells) {
		
	}
	
	public abstract void initBoard();
	
	public Cell getCell(int numero) {
		return Cell;
	}
	
	public int getNbOfCells() {
		return int;
	}
}
