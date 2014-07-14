package org.springframework.samples.reginf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.main.students.model.Login;
import org.springframework.main.students.model.Student;
import org.springframework.main.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public String signup(Model model){
		Student std = new Student();
		model.addAttribute("student", std);
		return "signup";
	}
	
	@RequestMapping(value="/signup.html", method=RequestMethod.POST)
	public String signup(@ModelAttribute("student") Student student, Model model){
		Student std = studentService.find(student.getUserName());
		if(std != null){
			model.addAttribute("message", "User Name exists.Try another user name");
			return "signup";
		}else{
			studentService.insertStudent(student);
			model.addAttribute("message", "Saved student details");
			return "redirect:login.html";
		}
	}
	
	@RequestMapping(value="/login.html", method=RequestMethod.GET)
	public String login(Model model){
		Login login = new Login();
		model.addAttribute("studentLogin", login);
		return "login";
	}
	
	@RequestMapping(value="/login.html", method=RequestMethod.POST)
	public String login(@ModelAttribute("studentLogin") Login login){
		boolean found = studentService.login(login.getName(), login.getPassword());
		return found ? "success" : "failure";
	}
}
