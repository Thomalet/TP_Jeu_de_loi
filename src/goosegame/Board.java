package goosegame;

public abstract class Board {
	protected final int nbOfCells = 0;
	protected Cell[] theCells;
	
	public Board(int nbOfCells) {
		
	}
	
	protected abstract void initBoard();
	
	public Cell getCell(int numero) {
		return null;
	}
	
	public int getNbOfCells() {
		return -1;
	}
}
