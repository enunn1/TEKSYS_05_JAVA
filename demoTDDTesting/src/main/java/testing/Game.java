package testing;

import java.util.ArrayList;

public class Game {
	
	//fields
	private String player;
	ArrayList<Player> playerList = new ArrayList<>();

	// constructors
	public Game(String player) {
		this.player = player;
	}

	public Game() {

	}

	// getters and setters
	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	
	// other methods
	
	public boolean add(Player player) {
		playerList.add(player);
		return true;
	}
	
	public void getWinner() {
		System.out.println("Winner");
	}

	@Override
	public String toString() {
		return "Game [player=" + player + ", playerList=" + playerList + "]";
	}
	
	

}
