package co.simplon.oauth2;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
//@RequestMapping("/np/private")
public class TestAuthent {

	@RequestMapping(value = "/np/private", method = RequestMethod.GET)
	//@ResponseBody
	public String toto() {
		return "private";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	//@ResponseBody
	public Map<String, String> titi(Principal principal) {
		Map<String, String> res = new HashMap<String, String>();
		res.put("name", principal.getName());
		return res;	
	}
	
	
}
