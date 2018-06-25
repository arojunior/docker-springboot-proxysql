package com.arojunior.mysqlcluster.service;

import java.util.List;
import com.arojunior.mysqlcluster.model.Post;

public interface PostService {
	
	List<Post> findAll();
}
