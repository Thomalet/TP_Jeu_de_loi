package goosegame;

public class TeleportCell extends NormalCell {
	
	private int dest;
	
	public TeleportCell(int i, int dest) {
		super(i);
		this.dest=dest;
	}
	
	@Override
	public int handleMove(int s) {
		return -1;
	}
}
