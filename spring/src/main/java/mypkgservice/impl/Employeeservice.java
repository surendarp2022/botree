package mypkgservice.impl;

import java.util.Set;

import Mypkg.model.Employee;


public interface Employeeservice {
	void add(Employee employee);
	
	Set<Employee> employee();

}
