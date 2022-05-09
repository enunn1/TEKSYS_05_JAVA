package testing;

public class Player {

	// fields
	private String playerName;

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public Player() {
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

}
