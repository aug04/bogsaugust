package aug.blogs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import aug.blogs.model.Users;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = {"/index", ""})
	public String goToAdmin(HttpServletRequest req, HttpServletResponse resp) {
		
		// TODO: check session, if exist forward to dashboard page, else redirect to login page
		/*Users user = (Users) req.getSession().getAttribute("user");
		if (user != null)
			return "admin/index";
		else
			return "common/auth/login";*/
		
		return "admin/index";
	}
}
