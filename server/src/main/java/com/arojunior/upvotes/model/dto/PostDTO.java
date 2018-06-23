package com.arojunior.upvotes.model.dto;

import java.util.Date;

import com.arojunior.upvotes.model.Post;

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
	
	public String getAuthor() {
		return post.getAuthor().getName();
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
