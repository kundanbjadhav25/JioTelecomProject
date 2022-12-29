package com.reliance.jio.telecom.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reliance.jio.telecom.model.User;

/**
 * 
 * @author Kundan
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

	@Query(value="select * from user where city=?1", nativeQuery = true)
	public List<User> findByCity(String city);
	
}
