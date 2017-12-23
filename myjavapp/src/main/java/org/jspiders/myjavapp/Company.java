package org.jspiders.myjavapp;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="company-data")
public class Company 
{
	private String compName;
	
	private HashMap<String, String> metaData;
	
	private List<Employee> empList;

	@XmlElement(name="employee")
	public List<Employee> getEmpList() {
		return empList;
	}
	
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Company [compName=" + compName + ", metaData=" + metaData + ", empList=" + empList + ", getEmpList()="
				+ getEmpList() + ", getCompName()=" + getCompName() + ", getMetaData()=" + getMetaData()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public HashMap<String, String> getMetaData() {
		return metaData;
	}

	public void setMetaData(HashMap<String, String> metaData) {
		this.metaData = metaData;
	}
}
