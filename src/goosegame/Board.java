package goosegame;

public abstract class Board {
	protected final int nbOfCells;
	protected Cell[] theCells;
	
	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells;
		this.theCells = new Cell[nbOfCells];
		this.initBoard();
	}
	
	protected abstract void initBoard();
	
	public Cell getCell(int numero) {
		if((numero>=0)&&(numero<this.nbOfCells)){
			return this.theCells[numero];
		}
		return null;
	}
	
	public int getNbOfCells() {
		return this.nbOfCells;
	}
}
