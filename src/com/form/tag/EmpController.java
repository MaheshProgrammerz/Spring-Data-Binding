package com.form.tag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create Empty emp Object 
		Emp emp = new Emp();
		
		//ADD to modelAttribute
		
		theModel.addAttribute("emp", emp);
		return "login-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("emp") Emp theEmp) {
		System.out.println("Name"+theEmp.getFullName());
		return "process-form";
	}
	
	
	
}
