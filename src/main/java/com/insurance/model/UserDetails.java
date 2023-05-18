package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String surname;
	private String email;
	private String userId;

	@OneToMany(mappedBy = "userId")
	private List<PolicyPremiumDetails> policyPremiumDetailsList;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<PolicyPremiumDetails> getPolicyPremiumDetailsList() {
		return policyPremiumDetailsList;
	}

	public void setPolicyPremiumDetailsList(List<PolicyPremiumDetails> policyPremiumDetailsList) {
		this.policyPremiumDetailsList = policyPremiumDetailsList;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", userId="
				+ userId + ", policyPremiumDetailsList=" + policyPremiumDetailsList + "]";
	}
	

}
