package aug.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = {"/index", ""})
	public String goToAdmin() {
		
		// TODO: check session, if exist forward to dashboard page, else redirect to login page
		
		return "admin/index";
	}
}
