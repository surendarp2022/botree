package mypkgservice.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import Mypkg.model.Employee;
@Service
public class EmployeeserviceImpl implements Employeeservice{
	
	private Set<Employee> employees= new HashSet<Employee>();
	
	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}
	

	@Override
	public Set<Employee> employee() {
		return employees;
	
	

}


	
		
	}
