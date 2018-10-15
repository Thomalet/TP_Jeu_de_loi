package goosegame;

public class NormalCell implements Cell {
	private Player player;
	private int index;

	public NormalCell(int i) {
		this.player = null;
		this.index = i;
	}
	
	@Override
	public boolean canBeLeft() {
		return true;
	}

	@Override
	public int getIndex() {
		return this.index;
	}

	@Override
	public int handleMove(int diceThrow) {
		return this.index;
	}

	@Override
	public boolean isBusy() {
		if (getPlayer() == null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void welcomePlayer(Player player) {
		this.player = player;
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

}
