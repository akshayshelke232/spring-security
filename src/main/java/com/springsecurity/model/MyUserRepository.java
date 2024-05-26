package com.springsecurity.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Integer>{

	Optional<MyUser> findByUsername(String username);
}
