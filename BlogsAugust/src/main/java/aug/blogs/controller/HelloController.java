package aug.blogs.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aug.blogs.dao.UserServiceImpl;
import aug.blogs.model.Users;

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private UserServiceImpl _userService;
	
	@RequestMapping("/01/{id}")
	public ModelAndView doHello(HttpServletRequest req, HttpServletResponse resp, @PathVariable("id") int id) {
		
		Users user = _userService.get(id);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "Welcome to hello page " + user.getUserName());
		map.put("message", "I'm controller hello world");
		map.put("user", user);
		
		ModelAndView mav = new ModelAndView("hello/01");
		mav.addObject("model", map);
		
		return mav;
	}
}
