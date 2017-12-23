package com.googlemaps.rest.services;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.googlemaps.dao.EmployeeDAO;
import com.googlemaps.dto.Employee;

@Path("employee")
public class EmployeeRestServices {

	@PUT
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean createEmployee(@FormParam("eid")int eid,
			@FormParam("fname")String fname,
			@FormParam("lname")String lname,
			@FormParam("designation")String designation,
			@FormParam("address1")String address1,
			@FormParam("address2")String address2,
			@FormParam("salary")double salary) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee e = new Employee();
		e.setEid(eid);
		e.setFname(fname);
		e.setLname(lname);
		e.setDesignation(designation);
		e.setAddress1(address1);
		e.setAddress2(address2);
		e.setSalary(salary);
		return dao.createEmployee(e);
	}
	
	
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteEmployee(@FormParam("eid")int eid) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.deleteEmployee(dao.readEmployee(eid));
	}
	
	@GET
	@Path("read")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee readEmployee(@QueryParam("eid")int eid) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.readEmployee(eid);
	}
	
	@GET
	@Path("readall")
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Employee> readEmployees() {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.readEmployees();
	}
	
	@POST
	@Path("modify")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean modifyEmployee(@FormParam("eid")int eid,
			@FormParam("fname")String fname,
			@FormParam("lname")String lname,
			@FormParam("designation")String designation,
			@FormParam("address1")String address1,
			@FormParam("address2")String address2,
			@FormParam("salary")double salary) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee e = new Employee();
		e.setEid(eid);
		e.setFname(fname);
		e.setLname(lname);
		e.setDesignation(designation);
		e.setAddress1(address1);
		e.setAddress2(address2);
		e.setSalary(salary);
		return dao.modifyEmployee(e);
	}
	
	
}
