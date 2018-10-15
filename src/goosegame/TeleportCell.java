package goosegame;

public class TeleportCell extends NormalCell {
	
	private int dest;
	
	public TeleportCell(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int handleMove(int s) {
		return -1;
	}
}
