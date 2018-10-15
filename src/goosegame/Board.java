package goosegame;

public abstract class Board {
	protected final int nbOfCells = 0;
	protected Cell[] theCells;
	
	public Board(int nbOfCells) {
		
	}
	
	protected abstract void initBoard();
	
	public Cell getCell(int numero) {
		return Cell;
	}
	
	public int getNbOfCells() {
		return int;
	}
}
