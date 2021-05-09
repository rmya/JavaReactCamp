package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println("The game called " + game.getGameName() +
				" purchased by the player named " + gamer.getFirstName() + " " + gamer.getLastName() ); 
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		
		double reducePrice = game.getPrice() - ( game.getPrice() * campaign.getDiscountRat() / 100);
		
		System.out.println("The game called " + game.getGameName() +
				" by named player " + gamer.getFirstName() + " " + gamer.getLastName()+
				"with a discount " + campaign.getDiscountRat() + " purchased for the price of " + reducePrice);
		
	}

}
