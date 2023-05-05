package com.pramata.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramata.Entity.Comments;
import com.pramata.Services.CommentsServices;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {
	
	@Autowired
	private CommentsServices services;
	
	@PostMapping("/save")
	public Comments saveCommentsHandler(Comments comments) {
		return services.saveComments(comments);
	}
	
	
	@GetMapping("/getAllcomments/{postId}")
	public ArrayList<Comments> getAllComments(@PathVariable("postId")Integer postId){
		return services.getAllComments(postId);
	}

}
