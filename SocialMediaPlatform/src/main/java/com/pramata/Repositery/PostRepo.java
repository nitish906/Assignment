package com.pramata.Repositery;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramata.Entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{
	
	ArrayList<Post> findAll();
	
	Post save (Post post);

}
