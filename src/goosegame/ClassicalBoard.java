package goosegame;

public class ClassicalBoard extends Board {
	
	public ClassicalBoard(int nbOfCells)  {
		super(nbOfCells);
	}
	
	public void initBoard() {
		
		//int[] a = {1,2,3,4};
		//boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
		//int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		//IntStream stream = Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x));
		
		final int[] trapIdx = {31,52};
		final int[][] teleportIdx = {{6,12},{42,30},{58,1}};
		final int[] gooseIdx = {9,18,27,36,45,54};
		final int[][] waitIdx = {{19,2}};
		this.theCells[0]=new StartCell();
		
		
		for (int idTrap : trapIdx)
			this.theCells[idTrap] = new TrapCell(idTrap);
		for (int idGoose: gooseIdx)
			this.theCells[idGoose] = new GooseCell(idGoose);
		for (int[] idTp: teleportIdx)
			this.theCells[idTp[0]] = new TeleportCell(idTp[0],idTp[1]);
		for (int[] idW8: waitIdx)
			this.theCells[idW8[0]] = new WaitCell(idW8[0],idW8[1]);

		for(int i=1;i<nbOfCells;i++)
			if (this.theCells[i]==null)
				this.theCells[i] = new NormalCell(i);
	}
	
	public Cell getCell(int idx) {
		return this.theCells[idx];
	}
}