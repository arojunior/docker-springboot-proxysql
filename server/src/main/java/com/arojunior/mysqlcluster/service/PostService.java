package com.arojunior.mysqlcluster.service;

import com.arojunior.mysqlcluster.model.Post;

import java.util.List;

public interface PostService {
	
	List<Post> findAll();
}
