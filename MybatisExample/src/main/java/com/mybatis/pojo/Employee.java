package com.mybatis.pojo;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int sal;
	private int phone;
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id,String name, String dept, int sal, int phone, String email) {
		super();
		this.id=id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.phone = phone;
		this.email = email;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
