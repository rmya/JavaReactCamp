import adapters.MerniseServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {


		Gamer gamer1 = new Gamer(1,"Rumeysa","Tan","12348697561",1996);
		Gamer gamer2 = new Gamer(2,"Ruken","Ay","19653278966",1993);
		Gamer gamer3 = new Gamer(3,"Merve","Yıldız","19653278967",2000);
		
		//********************************
		
		Game game1 = new Game(1,"PUBG",70);
		Game game2 = new Game(2,"ETS2",65.99);
		Game game3 = new Game(3,"Metin2",122.50);
		
		//*********************************
		
		Campaign campaign1 = new Campaign(1,"Summer Fire",60);
		Campaign campaign2 = new Campaign(2,"Black Friday",35);
		Campaign campaign3 = new Campaign(3,"Buy One, Get One FREE",20);
		
		//********************************
		
		GamerManager gamerManager = new GamerManager(new MerniseServiceAdapter());
		gamerManager.saveGamer(gamer1);
		gamerManager.deleteGamer(gamer3);
		gamerManager.updateGamer(gamer2);
		
		System.out.println("*************************************");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign2);
		campaignManager.updateCampaign(campaign3);

		System.out.println("*************************************");
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		gameManager.deleteGame(game3);
		gameManager.updateGame(game2);
		
		System.out.println("*************************************");
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(game1, gamer2, campaign1);
		saleManager.sale(game2, gamer1);
		saleManager.sale(game1, gamer3);
		
		
	}
	
}
