package goosegame;

public class GooseCell extends NormalCell {

	public GooseCell(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int handleMove(int s) {
		System.out.println("Je suis un goose.");
		return -1;
	}

}
