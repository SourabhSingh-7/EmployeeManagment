package com.ssr.empm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.empm.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}