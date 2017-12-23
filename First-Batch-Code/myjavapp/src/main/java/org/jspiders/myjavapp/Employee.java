package org.jspiders.myjavapp;

import java.util.Arrays;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"id", "name", "salary", "numbers", "empAddress"})
public class Employee 
{
	private int id;
	private String name;
	private float salary;
	private long[] numbers;
	private Set<Address> empAddress;
	
	@XmlAttribute(name="emp-id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name="emp-name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="emp-salary")
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@XmlElement(name="emp-number")
	@XmlElementWrapper(name="phone-numbers")
	public long[] getNumbers() {
		return numbers;
	}
	public void setNumbers(long[] numbers) {
		this.numbers = numbers;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", numbers=" + Arrays.toString(numbers)
				+ ", empAddress=" + empAddress + ", getId()=" + getId() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + ", getNumbers()=" + Arrays.toString(getNumbers()) + ", getEmpAddress()="
				+ getEmpAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	@XmlElement(name="address")
	@XmlElementWrapper(name="emp-address")
	public Set<Address> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}
}
