package com.safeinvest.empDAO;

import java.util.List;

import com.safeinvest.empData.Employee;

public interface EmpRepository {

	int createTable();

	Employee saveEmployees(Employee empdetails);

	Employee updateEmployees(Employee empdetails);

	Employee getEmployeeByID(int empcode);

	List<Employee> getAllEmployeesDetails();

	int deleteEmployeeById(int empcode);

}
