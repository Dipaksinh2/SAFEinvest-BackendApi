package com.safeinvest.empController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safeinvest.empDAO.EmpRepositoryImpl;
import com.safeinvest.empData.Employee;

@RestController
@CrossOrigin("*")
public class EmpControl {

	@Autowired
	private EmpRepositoryImpl emprepo;

	@PostMapping("/saveEmployeeData")
	public Employee saveEmployee(@RequestBody Employee empdetails) {
		return emprepo.saveEmployees(empdetails);
	}

	@PutMapping("/updateEmpData/{empCode}")
	public Employee updateEmployee(@PathVariable int empCode,@RequestBody Employee empdetails) {
		return emprepo.updateEmployees(empdetails);
	}

	@GetMapping("/getEmployeeByEmpCode/{empCode}")
	public Employee getEmpDetailsByEmpCode(@PathVariable int empCode) {
		return emprepo.getEmployeeByID(empCode);

	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return emprepo.getAllEmployeesDetails();
	}

	@DeleteMapping("/deleteEmployeeData/{empCode}")
	public int deleteEmployee(@PathVariable("empCode") int empCode) {
		return emprepo.deleteEmployeeById(empCode);	
		}
}
