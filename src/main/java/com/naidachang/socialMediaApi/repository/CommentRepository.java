package com.naidachang.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.naidachang.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
	
}
