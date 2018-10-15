package goosegame;

public class WaitCell extends NormalCell {

	private int timeToWait;
	private int timer;
	
	public WaitCell(int i, int _timeToWait) {
		super(i);
		timer=0;
		timeToWait=_timeToWait;
	}
	
	@Override
	public boolean canBeLeft() {
		return false;
	}
	
	@Override
	public void welcomePlayer(Player p) {
	}

}
