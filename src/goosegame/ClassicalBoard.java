package goosegame;

public class ClassicalBoard extends Board {
	
	private final int[] trapIdx= {31,52};
	private final int[][] teleportIdx= {{6,12},{42,30},{58,1}};
	private final int[] gooseIdx= {9,18,27,36,45,54};
	private final int[][] waitIdx= {{19,2}};
	
	public ClassicalBoard(int nbOfCells)  {
		super(nbOfCells);
	}
	
	public void initBoard() {
		//int[] a = {1,2,3,4};
		//boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
		
		//int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		//IntStream stream = Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x));
		for(int i=0;i<nbOfCells;i++)
			this.theCells[i] = new NormalCell(i);
		for (int idTrap : trapIdx)
			this.theCells[idTrap] = (TrapCell) this.theCells[i];
	}
}