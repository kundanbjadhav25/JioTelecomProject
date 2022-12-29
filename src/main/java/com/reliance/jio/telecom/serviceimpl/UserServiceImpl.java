package com.reliance.jio.telecom.serviceimpl;
// UserService implementation class
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.jio.telecom.exception.UserException;
import com.reliance.jio.telecom.model.User;
import com.reliance.jio.telecom.repository.UserRepository;
import com.reliance.jio.telecom.service.UserService;

import jakarta.transaction.Transactional;

/**
 * 
 * @author Kundan
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser(String city) {
		List<User> user = userRepository.findByCity(city);
		return user;
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserException("your "+user+" is incorrect");
		}else
		return user;
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
