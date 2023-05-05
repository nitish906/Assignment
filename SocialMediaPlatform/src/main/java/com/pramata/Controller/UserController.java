package com.pramata.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pramata.Entity.User;
import com.pramata.Services.UserServices;

@Controller
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserServices usrServices;
	
	@PostMapping("/save")
	public User saveUserHandler(@RequestBody User user) {
		return usrServices.submitUserData(user);
	}
	
	@GetMapping("/getUserDetails")
	public ArrayList<User> getAllUserHandler(){
		return usrServices.retriveallUserDet();
	}
	
	@GetMapping("/getAllUser/{userId}")
	public User getUserDetails(@PathVariable("userId") Integer userId) {
		return usrServices.getUserData(userId);
	}

}
