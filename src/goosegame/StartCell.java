package goosegame;

public class StartCell implements Cell {

	@Override
	public boolean canBeLeft() {
		return true;
	}
	@Override
	public int getIndex() {
		return 0;
	}

	@Override
	public int handleMove(int diceThrow) {
		return 0;
	}

	@Override
	public boolean isBusy() {
		return false;
	}

	@Override
	public void welcomePlayer(Player player) {
	}

	@Override
	public Player getPlayer() {
		return null;
	}

}
