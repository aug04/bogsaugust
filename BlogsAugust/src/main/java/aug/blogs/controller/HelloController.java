package aug.blogs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aug.blogs.dao.UsersService;
import aug.blogs.model.Users;

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private UsersService _userService;
	
	@RequestMapping("/01/{id}")
	public ModelAndView doHello(HttpServletRequest req, HttpServletResponse resp, @PathVariable("id") int id) throws Exception {
		
		/*Users ui = new Users();
		ui.setUserName("hungdm12");
		ui.setPassword("123456");
		ui.setEmail("manhhung.kt04@gmail.com12");
		ui.setDisplayName("Đoàn Mạnh Hùng");
		ui.setStatus(true);
		
		int affectedRows = _userService.insertUsers(ui);
		System.out.println("Insert user with id: " + ui.getId() + ", affected rows: " + affectedRows);*/
		
		List<Users> users = _userService.getAllUsers();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "Welcome to hello page ");
		map.put("message", "I'm controller hello world");
		map.put("users", users);
		
		ModelAndView mav = new ModelAndView("hello/01");
		mav.addObject("model", map);
		
		return mav;
	}
}
