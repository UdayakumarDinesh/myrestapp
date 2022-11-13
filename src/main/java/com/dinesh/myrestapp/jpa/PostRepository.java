package com.dinesh.myrestapp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinesh.myrestapp.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
