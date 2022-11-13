package com.dinesh.myrestapp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinesh.myrestapp.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
