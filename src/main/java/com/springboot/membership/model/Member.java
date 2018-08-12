package com.springboot.membership.model;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Members")
public class Member implements Serializable{
   
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String name;
	private String address;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "Member id: "+ this.id +" name: "+this.name+ " address: "+ this.address+ " age: "+ this.age;		
	}
	
	
	
}
