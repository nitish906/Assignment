package com.pramata.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramata.Entity.Comments;
import com.pramata.Repositery.CommentsRepo;

@Service
public class CommentsServices {
	
	@Autowired
	private CommentsRepo commentsRepo;
	
	public Comments saveComments(Comments comments) {
		return commentsRepo.save(comments);
	}
	
	public ArrayList<Comments> getAllComments(Integer postId){
		return commentsRepo.findAllByPostById();
	}
	

}
