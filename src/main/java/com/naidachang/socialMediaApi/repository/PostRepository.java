package com.naidachang.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.naidachang.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
