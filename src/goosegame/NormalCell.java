package goosegame;

public class NormalCell implements Cell {
	private Player player;
	private int index;

	public NormalCell(int i) {
		
	}
	
	@Override
	public boolean canBeLeft() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int handleMove(int diceThrow) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBusy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void welcomePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}