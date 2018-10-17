package goosegame;

public class WaitCell extends NormalCell {

	private int timeToWait;
	private int timer;
	
	public WaitCell(int i, int _timeToWait) {
		super(i);
		timeToWait=_timeToWait;
	}
	
	@Override
	public boolean canBeLeft() {
		timer+=1;
		return timer>=timeToWait;
	}
	
	@Override
	public void welcomePlayer(Player p) {
		super.welcomePlayer(p);
		timer=0;
	}

}
