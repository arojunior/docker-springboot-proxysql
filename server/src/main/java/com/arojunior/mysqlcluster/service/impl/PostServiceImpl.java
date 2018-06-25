package com.arojunior.mysqlcluster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arojunior.mysqlcluster.model.Post;
import com.arojunior.mysqlcluster.repository.PostRepository;
import com.arojunior.mysqlcluster.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}	
}
