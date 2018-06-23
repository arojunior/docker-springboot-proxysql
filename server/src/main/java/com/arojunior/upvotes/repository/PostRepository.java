package com.arojunior.upvotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arojunior.upvotes.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
