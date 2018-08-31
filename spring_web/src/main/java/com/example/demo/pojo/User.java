package com.example.demo.pojo;


public class User {
	
	private String name;
	
	private String userName;
	
	private String password;
	
	private Integer age;
	
	
	
	public User(String name, String userName, String password, Integer age) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public User(String name,Integer age) {
		this.age=age;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
