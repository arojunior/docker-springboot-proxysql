package com.arojunior.mysqlcluster.controller;

import com.arojunior.mysqlcluster.model.dto.PostDTO;
import com.arojunior.mysqlcluster.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PostController {
		
	private PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("/v1/posts")
	public List<PostDTO> list() {
		return postService.findAll().stream().map(PostDTO::new).collect(Collectors.toList());
	}	
}
