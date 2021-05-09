package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService ) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void saveGamer(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Saved to db :" + gamer.getFirstName()+" "+ gamer.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {

		System.out.println("Deleted to db: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		
		System.out.println("Update to db: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}
	

}
