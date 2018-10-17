package goosegame;

public class GooseCell extends NormalCell {

	public GooseCell(int i) {
		super(i);
	}
	
	@Override
	public int handleMove(int s) {
		return this.getIndex()+s;
	}

}
