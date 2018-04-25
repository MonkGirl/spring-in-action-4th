package com.springinaction.chapter11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Spitter")
public class Spitter {
	
	public Spitter() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;

	public Spitter(String username, String password, String firstName, String lastName) {
		this(null, username, password, firstName, lastName, null);
	}
	
	public Spitter(String username, String password, String firstName, String lastName, String email) {
	    this(null, username, password, firstName, lastName, email);
	}

	public Spitter(Long id, String username, String password, String firstName, String lastName) {
		this(id, username, password, firstName, lastName, null);
	}
	
	public Spitter(Long id, String username, String password, String firstName, String lastName, String email) {
	    this.id = id;
	    this.username = username;
	    this.password = password;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
