package com.pramata.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramata.Entity.User;
import com.pramata.Repositery.UserReop;

@Service
public class UserServices {
	
	@Autowired
	private UserReop userReop;
	
	public User submitUserData(User user) {
		return userReop.save(user);
	}
	
	public  ArrayList<User> retriveallUserDet(){
		return userReop.findAll();
	}
	
	public User getUserData(Integer userId) {
		return userReop.findAllByUserId();
	}

}
