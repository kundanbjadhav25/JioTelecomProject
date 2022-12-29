package com.reliance.jio.telecom.model;

// Spring bean class for user details
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * @author kundan
 *
 */
@Entity(name="user")
@Table(name = "user")
public class User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// declaring fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "gender")
	private String gender;
	@Column(name = "age")
	private String age;
	@Column(name = "city")
	private String city;

	/*
	 * // generating constructor public User(Integer id, String firstName, String
	 * lastname, String email, String gender, String age, String city) { super();
	 * this.id = id; this.firstName = firstName; this.lastname = lastname;
	 * this.email = email; this.gender = gender; this.age = age; this.city = city; }
	 */

	// generating getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// toString method
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email
				+ ", gender=" + gender + ", age=" + age + ", city=" + city + "]";
	}

}
