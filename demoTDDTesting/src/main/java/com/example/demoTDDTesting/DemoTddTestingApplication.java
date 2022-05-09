package com.example.demoTDDTesting;

import testing.Game;
import testing.Player;

public class DemoTddTestingApplication {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.setPlayerName("Ethan");
		
		Game g1 = new Game();
		g1.add(p1);
		//g1.setPlayer(p1.getPlayerName());
		
		System.out.println(g1.getPlayerList());
		g1.getWinner();
	}

}
