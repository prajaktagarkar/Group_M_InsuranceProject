package com.insurance.model;

import java.util.Date;
import java.util.List;

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
@Table(name="user")
public class Task157User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String name;
	private String email;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private String userName;
	private String password;
	@OneToMany(mappedBy = "userid")
	// @JoinColumn(referencedColumnName = "userid", insertable = false, updatable = false)
	    private List<Task157Premium> premiumList;

//Generate getter and setter
	

	public String getName() {
		return name;
	}

	public int getId() {
		return userid;
	}

	public void setId(int id) {
		this.userid = id;
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

	public List<Task157Premium> getPremium() {
		return premiumList;
	}

	public void setPremium(List<Task157Premium> premium) {
		this.premiumList = premium;
	}

	@Override
	public String toString() {
		return "Task157User [id=" + userid + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ ", userName=" + userName + ", password=" + password + ", premium=" + premiumList + "]";
	}

	


}
