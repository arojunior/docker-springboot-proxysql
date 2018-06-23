package com.arojunior.upvotes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arojunior.upvotes.model.Post;
import com.arojunior.upvotes.repository.PostRepository;
import com.arojunior.upvotes.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

}
