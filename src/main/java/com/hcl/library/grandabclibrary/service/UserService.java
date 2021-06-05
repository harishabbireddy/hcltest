package com.hcl.library.grandabclibrary.service;

import com.hcl.library.grandabclibrary.model.User;

public interface UserService {

	public User createUser(User user);

	public User getUser();

	public void deleteUser(User user);
	
	User findUsersByFirstName(String firstname);

	User findUsersByLastName(String lastname);

	User findUsersByRole(String role);
	
}
