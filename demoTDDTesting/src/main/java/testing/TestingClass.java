package testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestingClass {

	@Test
	public void testGame() {
		// Give it something to test

		Player p1 = new Player();
		String expectedName = "Leon";
		p1.setPlayerName("Leon");

		// when it gets set
		String actualName = p1.getPlayerName();

		// then test the expected output
		Assert.assertEquals(expectedName, actualName);
	}

	@Test
	public void testGameList() {
		// Give it something to test
		Player p1 = new Player();
		p1.setPlayerName("Leon");

		Game g1 = new Game();
		String expectedName = "Leon";
		g1.add(p1);

		// when it gets set
		String actualName = g1.getPlayerList().get(0).getPlayerName();

		// then test the expected output
		Assert.assertEquals(expectedName, actualName);
	}
}
