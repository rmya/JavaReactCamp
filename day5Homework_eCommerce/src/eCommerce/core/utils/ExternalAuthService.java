package eCommerce.core.utils;

import eCommerce.entities.Dtos.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);

}
