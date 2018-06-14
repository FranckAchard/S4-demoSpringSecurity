package co.simplon.oauth2;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// RestController gère tout seul les ResponseBody
@RestController
// @RequestMapping("/np/private")
public class TestAuthentController {
	
	@Inject
	MyService myservice;

	@RequestMapping(value = "/np/private", method = RequestMethod.GET)
	// @ResponseBody
	public String toto() {
		return "private";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	// @ResponseBody
	public Map<String, String> titi(Principal principal) {
		Map<String, String> res = new HashMap<String, String>();
		System.err.println(principal);
		res.put("name", principal.getName());
		return res;	
	}
	
   	@RequestMapping("/np/private")
	public String privateInfo() {
		return myservice.privateInfo();
	}
	
	@RequestMapping("/np/admin")
	public String adminInfo() {
		return myservice.adminInfo();
	}
	
	@RequestMapping("/np")
	public String np() {
		return myservice.publicInfo();
	}
	
}
