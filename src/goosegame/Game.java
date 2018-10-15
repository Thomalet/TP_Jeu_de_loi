package goosegame;

import java.util.ArrayList;
import java.util.List;

public class Game {
	protected List<Player> thePlayers;
	protected Board board;
	
	public Game(Board board) {
		this.board = board;
		this.thePlayers = new ArrayList();
	}
	
	public void addPlayer(Player p) {
		this.thePlayers.add(p);
	}
	
	public void play() {
		Player player = this.thePlayers.get(0);
		Boolean continueGame = true;
		while (continueGame == true) {
			if (player.getClass().canBeLeft()==true) {
				
			}
		}
	}
}
