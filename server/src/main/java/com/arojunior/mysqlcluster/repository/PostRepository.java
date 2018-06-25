package com.arojunior.mysqlcluster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arojunior.mysqlcluster.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
