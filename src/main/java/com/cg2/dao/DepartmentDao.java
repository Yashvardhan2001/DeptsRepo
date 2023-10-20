package com.cg2.dao;

import java.util.List;

import com.cg2.entity.Department;

public interface DepartmentDao {

	String addDepartment(Department d);

	List<Department> getAllDepartment();
}
