package com.hcl.library.grandabclibrary.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.library.grandabclibrary.model.User;
import com.hcl.library.grandabclibrary.repository.UserRepository;
import com.hcl.library.grandabclibrary.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public User getUser() {
		return null;
	}

	@Override
	public User findUsersByFirstName(String firstname) {
		return userRepository.findUsersByFirstname(firstname);
	}

	@Override
	public User findUsersByLastName(String lastname) {
		return userRepository.findUsersByLastname(lastname);
	}

	@Override
	public User findUsersByRole(String role) {
		return userRepository.findUsersByRole(role);
	}

}
