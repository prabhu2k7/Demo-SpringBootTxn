package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserServcie;

@RestController
@RequestMapping("/api")
public class UserController
{

	@Autowired
	UserServcie userServcie;

	@PostMapping("/insert")
	public String insert(@RequestBody User user)
	{
		if (user == null)
		{
			return "Failed to process user";
		}
		else
		{
			String result = userServcie.insert(user);
			return result;
		}
	}

}
