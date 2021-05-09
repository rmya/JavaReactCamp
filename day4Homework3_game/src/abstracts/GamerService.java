package abstracts;

import entities.Gamer;

public interface GamerService {

	void saveGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
}
