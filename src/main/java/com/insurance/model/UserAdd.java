package com.insurance.model;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="user1")
public class UserAdd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String email;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private String userName;
	private String password;
	@OneToMany(targetEntity = ClaimAdd.class,cascade = CascadeType.ALL)
	 // @JoinColumn(referencedColumnName = "userId")
	    private List<ClaimAdd> claim;

//Generate getter and setter
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<ClaimAdd> getClaim() {
		return claim;
	}

	public void setClaim(List<ClaimAdd> claim) {
		this.claim = claim;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", userName=" + userName + ", password=" + password + ", claim=" + claim + "]";
	}

	
	
}
