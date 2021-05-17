package net.javaguides.springboot.Service;

import java.util.*;
import net.javaguides.springboot.Model.*;



public interface EmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmplEmpTrByid(int id);
	void saveEmp(Employee employee);
}
