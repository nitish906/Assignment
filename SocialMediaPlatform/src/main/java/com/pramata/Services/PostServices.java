package com.pramata.Services;

import java.sql.Date;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramata.Entity.Post;
import com.pramata.Repositery.PostRepo;

import lombok.Data;

@Service
public class PostServices {
	
	@Autowired
	private PostRepo postRepo;
	
	public ArrayList<Post> savePost(Post PostData){
		
		postRepo.save(PostData);
		ArrayList<Post> result=retrivePost();
		return result;
	}
	
	public ArrayList<Post> retrivePost(){
		ArrayList<Post> result=postRepo.findAll();
		return result;
	}
	
	public ArrayList<Post> deletePost(Integer postId){
		postRepo.deleteById(postId);
		ArrayList<Post> result=retrivePost();
		return result;
		
	}

}
