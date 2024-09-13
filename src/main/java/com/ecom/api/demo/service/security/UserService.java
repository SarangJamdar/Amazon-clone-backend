package com.ecom.api.demo.service.security;

import com.ecom.api.demo.model.User;

import jakarta.annotation.PostConstruct;

public interface UserService {

    boolean createUser(User user);

    @PostConstruct
    void createAdminAccount();
	
	
}
