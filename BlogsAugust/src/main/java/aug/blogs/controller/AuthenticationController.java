package aug.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("authenticationController")
@RequestMapping("/common/auth")
public class AuthenticationController {

	@RequestMapping("/login")
	public String goToAdmin() {
		
		return "common/auth/login";
	}
}
