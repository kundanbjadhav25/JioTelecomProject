package com.reliance.jio.telecom.model;

import jakarta.persistence.*;

//this is Bean class
/**
 *
 * @author Kundan
 */
@Entity
@Table(name = "connection")
public class Connection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "connectionNumber")
	private String connectionNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "connectionPlan")
	private String connectionPlan;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private String status;

	@Column(name="planType")
	private String planType;

	public Connection(Integer id, String connectionNumber, String email, String connectionPlan, String name,
			String status, String planType) {
		super();
		this.id = id;
		this.connectionNumber = connectionNumber;
		this.email = email;
		this.connectionPlan = connectionPlan;
		this.name = name;
		this.status = status;
		this.planType = planType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConnectionNumber() {
		return connectionNumber;
	}

	public void setConnectionNumber(String connectionNumber) {
		this.connectionNumber = connectionNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConnectionPlan() {
		return connectionPlan;
	}

	public void setConnectionPlan(String connectionPlan) {
		this.connectionPlan = connectionPlan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}
	
}
