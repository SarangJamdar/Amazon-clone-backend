package com.ecom.api.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.api.demo.enums.UserRole;
import com.ecom.api.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

	boolean existsByEmail(String email);

	User findByUserRole(UserRole admin);
}
