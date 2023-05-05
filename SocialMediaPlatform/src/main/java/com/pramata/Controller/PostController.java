package com.pramata.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramata.Entity.Post;
import com.pramata.Services.PostServices;

@RestController
@RequestMapping("/api/post")
public class PostController {
	
	@Autowired
	private PostServices dao;
	
	@PostMapping("/savePost")
	public ArrayList<Post> savePostsHandler(@RequestBody Post body){
		ArrayList<Post> postsave=dao.savePost(body);
		return postsave;
	}
	
	@GetMapping("/getPost")
	public ArrayList<Post> retrieveAllPostHandler(){
		ArrayList<Post> getPost=dao.retrivePost();
		return getPost;
	}
	
	@DeleteMapping("/delete")
	public ArrayList<Post> deletePostHandler(@PathVariable("postId") Integer postId){
		ArrayList<Post> deletePost=dao.deletePost(postId);
		return deletePost;
	}

}
