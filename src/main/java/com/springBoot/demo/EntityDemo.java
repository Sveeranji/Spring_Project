package com.springBoot.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EntityDemo {
	@Id
	private Integer id;
	private String name;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "EntityDemo [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public EntityDemo(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public EntityDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
