package com.ssr.empm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ssr.empm.dto.UserRegistrationDto;
import com.ssr.empm.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}