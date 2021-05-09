package abstracts;

import entities.Game;

public interface GameService {

	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
