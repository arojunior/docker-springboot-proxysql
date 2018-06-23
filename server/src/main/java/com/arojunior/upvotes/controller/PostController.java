package com.arojunior.upvotes.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arojunior.upvotes.model.dto.PostDTO;
import com.arojunior.upvotes.service.PostService;

@RestController
public class PostController {
		
	private PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("/v1/posts")
	public List<PostDTO> index() {
		return postService.findAll().stream().map(PostDTO::new).collect(Collectors.toList());
	}
}
