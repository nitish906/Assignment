package com.pramata.Repositery;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramata.Entity.User;

@Repository
public interface UserReop extends JpaRepository<User, Integer> {
	
	
	User save(User user);
	ArrayList<User>findAll();
	User findAllByUserId();

}
