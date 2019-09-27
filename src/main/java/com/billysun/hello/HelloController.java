package com.billysun.hello;

import org.springframework.web.bind.annotation.RestController;

import com.billysun.dao.UserDao;
import com.billysun.service.UserService;
import com.google.gson.Gson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired(required = false)
	UserService userService;

	@RequestMapping("/home")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/user")
	public String user() {
		List<UserDao> users = userService.getUserDao();
		String obstr = new Gson().toJson(users);
		return obstr;
	}
}
