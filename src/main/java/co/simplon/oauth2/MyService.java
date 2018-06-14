package co.simplon.oauth2;

import javax.inject.Named;

import org.springframework.security.access.annotation.Secured;

@Named
public class MyService {
	
	public String publicInfo() {
		return "for anybody";
	}

	@Secured("ROLE_ADMIN")
	public String adminInfo() {
		return "for admin only";
	}
	
	@Secured("ROLE_USER")
	public String privateInfo() {
		return "for user";
	}
}
