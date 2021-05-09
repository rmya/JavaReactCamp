package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		
		System.out.println("New game is added the system: " + game.getGameName());
	}

	@Override
	public void deleteGame(Game game) {
		
		System.out.println("Game deleted: " + game.getGameName());
		
	}

	@Override
	public void updateGame(Game game) {
		
		System.out.println("Game updated: " + game.getGameName());
		
	}

}
