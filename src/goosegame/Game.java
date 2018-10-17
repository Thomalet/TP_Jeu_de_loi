package goosegame;

import java.util.ArrayList;
import java.util.Iterator;
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
		if(n>this.board.getNbOfCells()-1) {
			return 2*(this.board.getNbOfCells() - 1) - n;
		}
		else {
			return n;
		}
		//return n>=this.board.getNbOfCells()?n-=this.board.getNbOfCells()-n:n;
	}
	
	public void play() {
		Iterator<Player> iterator = this.thePlayers.iterator();
		Player player = iterator.next();
		Boolean continueGame = true;
		while (continueGame == true) {
			if (player.getCell().canBeLeft()==true) {
				System.out.println(player.toString() + " est sur " + player.getCell().getIndex());
				int score = player.twoDiceThrow();
				System.out.println(correctNbreCell(player.cell.getIndex() + score));
				
				Cell intermediaire = this.board.getCell(correctNbreCell(player.cell.getIndex() + score));
				System.out.println("Case inter " + intermediaire.getIndex());
				Cell finalCell = this.board.getCell(correctNbreCell(intermediaire.handleMove(score)));
				System.out.println("Case final " + finalCell.getIndex());
				
				if(finalCell.isBusy()) {
					player.getCell().welcomePlayer(null);
					player.setCell(finalCell);
					finalCell.welcomePlayer(player);
				}
				else {
					//Problème de pointeur, onn arrive pas à intervertir de joueur quand ils sont deux sur une case
					Cell initialCell = player.getCell();
					Player playerDeplace = finalCell.getPlayer();
					
					
					
					initialCell.welcomePlayer(playerDeplace);
					playerDeplace.setCell(initialCell);
					
					player.setCell(finalCell);
					finalCell.welcomePlayer(player);
				}
			}
			
			if(player.getCell().getIndex() == (this.board.getNbOfCells() - 1)) {
				System.out.println(player.toString() + " a gagné !!!");
				continueGame = false;
			}
			
			else if(iterator.hasNext()) {
				player = iterator.next();
			}
			
			else {
				iterator = this.thePlayers.iterator();
				player = iterator.next();
			}
		}
	}
}
