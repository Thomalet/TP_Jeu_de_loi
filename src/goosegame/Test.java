package goosegame;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 22;
		Board plateau1 = new ClassicalBoard(64);
		Game Jeu1 = new Game(plateau1);
		Player p1 = new Player("Thomas Malet", plateau1.getCell(0));
		Player p2 = new Player("Jules", plateau1.getCell(0));
		Player p3 = new Player("Roland", plateau1.getCell(0));
		Jeu1.addPlayer(p1);
		Jeu1.addPlayer(p2);
		Jeu1.play();
	}

}
