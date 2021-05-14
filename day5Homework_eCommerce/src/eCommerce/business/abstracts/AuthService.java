package eCommerce.business.abstracts;

import eCommerce.entities.Dtos.LoginDto;
import eCommerce.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);   //maile göre bir kulllanıcı var mı yook mu
	void Login(LoginDto dto);

}
