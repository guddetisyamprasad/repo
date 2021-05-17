package net.javaguides.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import net.javaguides.springboot.Model.Employee;
import net.javaguides.springboot.Repository.EmployeeRepository;
@Service
public class EmployeeServiceimpl implements EmployeeService{

	@Autowired
	private EmployeeRepository emprepository;
	@Override
	public  List<Employee> getAllEmployee()
	{
		
		return emprepository.findAll();
	}
	@Override
	public Employee getEmplEmpTrByid(int id)
	{
	
		Employee emp=null;
		
		Optional<Employee> optional= emprepository.findById(id);
		if(optional.isPresent())
		{
		emp=optional.get();	
		}
		else
		{
		throw new RuntimeException("Invalid Employee");
		}
		return emp;
	}
	@Override
	public void saveEmp(Employee Employee)
	{
	
		 this.emprepository.save(Employee);
	}
	
}
