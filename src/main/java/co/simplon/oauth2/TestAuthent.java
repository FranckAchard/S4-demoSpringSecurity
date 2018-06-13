package co.simplon.oauth2;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
@RequestMapping("/np/private")
public class TestAuthent {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String toto() {
		return "private";
	}
	
}
