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
	
	private int correctNbreCell(int n)  {
		return n>this.board.getNbOfCells()?n-=this.board.getNbOfCells()-n:n;
	}
	
	public void play() {
		Player player = this.thePlayers.get(0);
		Boolean continueGame = true;
		while (continueGame == true) {
			if (player.getCell().canBeLeft()==true) {
				int score = player.twoDiceThrow();
				Cell intermediaire = this.board.getCell(correctNbreCell(player.cell.getIndex() + score));
				player.setCell(this.board.getCell(correctNbreCell(intermediaire.handleMove(score))));
				//Vider la case
				//Condition fin de jeu
				// Gérer le joueur suivant
			}
		}
	}
}
