package com.hcl.library.grandabclibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.library.grandabclibrary.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findUsersByFirstname(String firstname);

	User findUsersByLastname(String lastname);

	User findUsersByRole(String role);

}
