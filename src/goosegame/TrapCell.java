package goosegame;

public class TrapCell extends NormalCell {

	public TrapCell(int i) {
		super(i);
	}
	

	@Override
	public boolean canBeLeft() {
		return false;
	}
}
