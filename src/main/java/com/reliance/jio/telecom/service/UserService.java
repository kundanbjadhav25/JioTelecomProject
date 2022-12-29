package com.reliance.jio.telecom.service;

import java.util.List;
import java.util.Optional;

import com.reliance.jio.telecom.model.User;
/**
 * 
 * @author Kundan
 *
 */
public interface UserService {

	// method to save user
	public User saveUser(User user);

	// method to fetch all users by using city
	public List<User> getAllUser(String city);

	// method to fetch single user by using id
	public Optional<User> getUserById(Integer id);

	// method to delete user
	public void deleteUser(Integer id);

}
