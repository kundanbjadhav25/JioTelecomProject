package com.reliance.jio.telecom.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reliance.jio.telecom.exception.ConnectionTypeException;
import com.reliance.jio.telecom.model.Connection;
import com.reliance.jio.telecom.repository.ConnectionRepository;
import com.reliance.jio.telecom.service.ConnectionService;

/**
 *
 * @author Kundan
 */
@Service
public class ConnectionServiceImpl implements ConnectionService {

	private static final Logger logger = LoggerFactory.getLogger(ConnectionServiceImpl.class);

	@Autowired
	private ConnectionRepository repo; // we are injecting the repo object into ConnectionServiceImpl class

	@Override
	public Iterable<Connection> getAllConnection() {
		logger.info("ConnectionServiceImpl Implementation : getAllConnections() method");
		return repo.findAll(); 
	}

	@Override
	@Transactional
	public Connection saveConnection(Connection connection) {
		logger.info("Connection Service Implementation : savePolicy() method");
		return repo.save(connection); 
	}

	@Override
	public Optional<Connection> getConnectionById(Integer Id) {
		logger.info("Connection Service Implementation : getPolicyById() method");

		Optional<Connection> connection = repo.findById(Id);

		if (connection.equals(null)) { 
			throw new ConnectionTypeException("Connection id " + Id + " incorrect..");
		}
		return connection;
	}

	@Override
	public void deleteConnection(Integer id) {
		logger.info("Connection Service Implementation : deleteConnection() method");
		repo.deleteById(id);
	}

}
