package com.reliance.jio.telecom.controller;
import java.util.List;
import java.util.Optional;

// User Controller class contain All REST API methods
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.jio.telecom.model.User;
import com.reliance.jio.telecom.service.UserService;

import jakarta.transaction.Transactional;

/**
 * 
 * @author Kundan
 *
 */
@RestController
@RequestMapping("/userclass")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	@Transactional
	public ResponseEntity<User> saveUserData(@RequestBody User user){
		User saveUser=userService.saveUser(user);
		return ResponseEntity.ok().body(saveUser);
	}
	
	@GetMapping("/getuser/{city}")
	public ResponseEntity<List<User>> getAllUserByCity(@PathVariable("city") String city){
		List<User> userList=userService.getAllUser(city);
		return ResponseEntity.ok().body(userList);
	}
	
	@GetMapping("/getuserid/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id){
		Optional<User> singleUser=userService.getUserById(id);
		return ResponseEntity.ok().body(singleUser);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUserData(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
}
