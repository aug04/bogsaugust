package aug.blogs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("authenticationController")
@RequestMapping("/common/auth")
public class AuthenticationController {

	@RequestMapping(value = { "/login", "" })
	public String goToAdmin(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().invalidate();
		
		return "common/auth/login";
	}
}
