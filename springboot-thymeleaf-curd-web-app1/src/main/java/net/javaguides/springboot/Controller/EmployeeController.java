package net.javaguides.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import net.bytebuddy.matcher.ModifierMatcher.Mode;
import net.javaguides.springboot.Model.Employee;
import net.javaguides.springboot.Service.EmployeeService;



@Controller
public class EmployeeController {

	 @Autowired
	 private EmployeeService empservice; 
	 
	 /* @GetMapping("/")
public String showemplist(Model model)
	
	 {
		 
		 
		 model.addAttribute("Listemployees",empservice.getAllEmployee());
		 return "index";
		
	 }
	 
	 @GetMapping("/showformforupdate/{id}")
		public String showfromforupdate(@PathVariable(value="id") int id,Model model)
		{
			Employee emp=empservice.getEmplEmpTrByid(id);
			model.addAttribute("emp", emp);
			return "update_emp";
		}
	 
	 @PostMapping("/saveEmp")  //saveEmp 
		public String saveEmp(@ModelAttribute("employee") Employee emp)
		{
			System.out.println("SYAM EMP");
			empservice.saveEmp(emp);
			return "redirect:/";
		}*/
	 
	 
}
