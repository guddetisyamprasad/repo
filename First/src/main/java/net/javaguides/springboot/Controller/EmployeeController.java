package net.javaguides.springboot.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/Getall")
	public List<Employee> getall()
	{
		System.out.println("Test...!!");
		Employee e1=new Employee("syam", "prasad", "syam@gmil.com","Vizag",11456789);
		Employee e2=new Employee("ram", "prasad", "ram@gmil.com","Vizag",789945613);
		Employee e3=new Employee("raj", "prasad", "raj@gmil.com","Vizag",53971426);
		Employee e4=new Employee("vara", "prasad", "vara@gmil.com","Vizag",852741369);

		 List<Employee> emp=new  ArrayList();
		 emp.add(e1);
		 emp.add(e2);
		 emp.add(e3);
		 emp.add(e4);
		 
		 return emp;
	}
}
