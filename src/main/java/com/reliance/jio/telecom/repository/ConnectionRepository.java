package com.reliance.jio.telecom.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reliance.jio.telecom.model.Connection;

/**
*
* @author Kundan
*/
@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Serializable>{
	

}
