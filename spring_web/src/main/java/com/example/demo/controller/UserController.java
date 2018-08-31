package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.pojo.User;
import com.example.demo.service.LoginService;

@Controller
public class UserController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/user",method = RequestMethod.POST)
    public String getUserList(ModelMap map,HttpServletRequest request,HttpServletResponse response) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(loginService.Check(username, password)) {
			List<User> list=new ArrayList<>();
			list.add(new User("mike",20));
			list.add(new User("tom",10));
		    map.addAttribute("userList", list);
		    map.addAttribute("msg","Hello"+username);
			return "userlist";
		}	
		String mString="用户名或密码错误";
		map.addAttribute("failure", mString);
		return "login";
		
    }
	
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String login(ModelMap map) {
        map.addAttribute("msg", "请登陆");
        return "login";
    }
	
}
