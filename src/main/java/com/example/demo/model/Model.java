package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER_DETAILS")
public class Model {
	@Id
      private int id;
      private String name;
      private String address;
      private long phnum;
      private String email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, String address, long phnum, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phnum = phnum;
		this.email = email;
	}
      
      
}
