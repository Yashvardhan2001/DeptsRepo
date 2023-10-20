package com.cg2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg2.dao.DepartmentDao;
import com.cg2.entity.Department;
import com.cg2.repository.DepartmentRepository;

@Service

public class DepartmentService implements DepartmentDao {

	@Autowired

	DepartmentRepository dr;

	@Override

	public String addDepartment(Department d) {

		dr.save(d);

		return "Department added.....";

	}

	@Override

	public List<Department> getAllDepartment() {

		return dr.findAll();

	}

}
