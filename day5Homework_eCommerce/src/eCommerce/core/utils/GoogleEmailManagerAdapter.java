package eCommerce.core.utils;

import eCommerce.business.concretes.GoogleEmailManager;
import eCommerce.core.EmailService;

public class GoogleEmailManagerAdapter implements EmailService{
	
	private GoogleEmailManager googleEmailManager;
	

	public GoogleEmailManagerAdapter(GoogleEmailManager googleEmailManager) {
		super();
		this.googleEmailManager = googleEmailManager;
	}

	
	@Override
	public void send(String email, String message) {
		
		googleEmailManager.send(email, message);
		
	}

}
