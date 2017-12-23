package com.googlemaps.dao;

import java.util.HashSet;

import com.googlemaps.dto.Employee;

public class EmployeeDAO {
	static private HashSet<Employee> employees = new HashSet<Employee>();

	public boolean createEmployee(Employee e) {
		return employees.add(e);
	}

	public boolean deleteEmployee(Employee e) {
		return employees.remove(e);
	}

	public Employee readEmployee(int eid) {
		Employee emp = new Employee();
		for (Employee employee : employees) {
			if (employee.getEid() == eid)
				emp = employee;
		}
		return emp;
	}

	public HashSet<Employee> readEmployees() {
		return employees;
	}

	public boolean modifyEmployee(Employee e) {
		for (Employee employee : employees) {
			if (employee.equals(e)) {
				employee.setEid(e.getEid());
				employee.setFname(e.getFname());
				employee.setLname(e.getLname());
				employee.setDesignation(e.getDesignation());
				employee.setAddress1(e.getAddress1());
				employee.setAddress2(e.getAddress2());
				employee.setSalary(e.getSalary());
				return true;
			} else
				return false;
		}
		return false;
	}
}
