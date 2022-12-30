package com.reliance.jio.telecom.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.jio.telecom.exception.ConnectionTypeException;
import com.reliance.jio.telecom.model.Connection;
import com.reliance.jio.telecom.service.ConnectionService;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author Kundan
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/connection")
public class ConnectionController {

	private static final Logger logger = LoggerFactory.getLogger(ConnectionController.class);

	@Autowired
	private ConnectionService coonectionService;

	@GetMapping("/getAll")
	public @ResponseBody Iterable<Connection> getAllConnection() throws Exception {
		logger.info("Connection Rest Controller Implementation : getAllConnection() method");
		return coonectionService.getAllConnection(); 
	}

	@PostMapping("/save")
	public ResponseEntity<Connection> createConnection(@RequestBody Connection connection, HttpServletRequest request)
			throws Exception {
		Connection createdConnection = this.coonectionService.saveConnection(connection);
		logger.info("Connection Rest Controller Implementation : saveConnection() method");
		return ResponseEntity.ok().body(createdConnection); 
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Connection> getConnectionById(@PathVariable("id") Integer id) { 
		Optional<Connection> connection = coonectionService.getConnectionById(id); 
		logger.info("Connection Rest Controller Implementation : getConnectionById() method");
		if (connection.isPresent()) {
			return ResponseEntity.ok().body(connection.get());
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deleteConnectionById(@PathVariable("id") Integer id) throws ConnectionTypeException {
		logger.info("Connection Rest Controller Implementation : deleteConnectionById() method");
		coonectionService.deleteConnection(id);
	}
}
