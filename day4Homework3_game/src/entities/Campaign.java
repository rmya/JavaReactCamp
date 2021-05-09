package entities;

import abstracts.Entity;

public class Campaign implements Entity{

	private int id;
	private String campaignName;
	private double discountRat;
	
	public Campaign(int id, String campaignName, double discountRat) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRat = discountRat;
	}
	
	//encapsulation
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRat() {
		return discountRat;
	}

	public void setDiscountRat(double discountRat) {
		this.discountRat = discountRat;
	}
	
}
