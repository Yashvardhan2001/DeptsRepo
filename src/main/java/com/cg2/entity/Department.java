package com.cg2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	private String departmentName;
	private String departmentAddress;
	
	public Department(int id, String departmentName, String departmentAddress) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + "]";
	}
	
	

}
