package com.pramata.Repositery;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramata.Entity.Comments;

public interface CommentsRepo extends JpaRepository<Comments, Integer> {

	
	Comments save(Comments comments);
	
	
	ArrayList<Comments>findAllByPostById();
}
