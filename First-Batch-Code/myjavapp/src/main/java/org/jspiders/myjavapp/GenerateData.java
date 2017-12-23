package org.jspiders.myjavapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateData 
{
	private GenerateData(){}
	
	public static Company generate(){
		short no1 = 1; 
		Address empAddr1 = new Address();
		empAddr1.setHouseNo(no1);
		empAddr1.setAddrType("present");
		empAddr1.setAddress1("3rd A Cross");
		empAddr1.setAddress2("10th Main, 7th Cross");
		empAddr1.setCity("Bangalore");
		empAddr1.setLandmark("Near Bus Stop");
		empAddr1.setPincode(123456);
		
		short no2 = 2; 
		Address empAddr2 = new Address();
		empAddr2.setHouseNo(no2);
		empAddr2.setAddrType("permanent");
		empAddr2.setAddress1("2nd A Cross");
		empAddr2.setAddress2("12th Main, 9th Cross");
		empAddr2.setCity("Mysore");
		empAddr2.setLandmark("Near Bus Stop");
		empAddr2.setPincode(789456);
		
		Set<Address> empAddrs = new HashSet<Address>();
		empAddrs.add(empAddr1);
		empAddrs.add(empAddr2);
		
		Employee emp1 = new Employee();
		emp1.setId(1234);
		emp1.setName("Praveen");
		emp1.setSalary(100.20f);
		emp1.setNumbers(new long[]{123465789l, 987654321l});
		emp1.setEmpAddress(empAddrs);
		
		Employee emp2 = new Employee();
		emp2.setId(4567);
		emp2.setName("Naveen");
		emp2.setSalary(100.20f);
		emp2.setNumbers(new long[]{123465789l, 987654321l});
		emp2.setEmpAddress(empAddrs);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		HashMap<String, String> cmpData = new HashMap<String, String>();
		cmpData.put("location", "bangalore");
		cmpData.put("type", "institute");
		
		Company cmp = new Company();
		cmp.setCompName("JSpiders");
		cmp.setEmpList(empList);
		cmp.setMetaData(cmpData);
		
		return cmp;
	}
}
