package goosegame;

public class TrapCell extends NormalCell {

	public TrapCell(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeLeft() {
		return false;
	}
}
