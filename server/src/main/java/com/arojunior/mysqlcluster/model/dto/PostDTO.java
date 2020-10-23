package com.arojunior.mysqlcluster.model.dto;

import com.arojunior.mysqlcluster.model.Post;

import java.util.Date;

public class PostDTO {

	private Post post;
	
	public PostDTO(Post post) {
		this.post = post;
	}
	
	public Integer getId() {
		return post.getId();
	}
	
	public String getContent() {
		return post.getContent();
	}		
	
	public Integer getLikes() {
		return post.getLikes();
	}
	
	public Integer getDislikes() {
		return post.getDislikes();
	}
	
	public Date getDate() {
		return post.getCreated();
	}
	
}
