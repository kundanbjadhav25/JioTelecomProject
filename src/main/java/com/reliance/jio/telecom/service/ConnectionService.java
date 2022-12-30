package com.reliance.jio.telecom.service;

import java.util.Optional;

import com.reliance.jio.telecom.model.Connection;

/**
 *
 * @author Kundan
 */
public interface ConnectionService {

	public Iterable<Connection> getAllConnection();

	public Connection saveConnection(Connection connection);

	public Optional<Connection> getConnectionById(Integer id);

	public void deleteConnection(Integer id);

}
