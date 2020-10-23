package com.arojunior.mysqlcluster.repository;

import com.arojunior.mysqlcluster.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
