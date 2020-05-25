package com.suraj.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.suraj.demo.Student;
import com.suraj.demo.StudRepo.studRepo;

@Controller
public class StudController {
	
		@Autowired
		studRepo srp;
		
	
		@RequestMapping("/addStudent")
		public String home(Student stud) {  
			srp.save(stud);
			return "home.jsp";
		}
		@RequestMapping("/searchStud")
		public String searchStud() { // renderSearchStudentPage
			return "searchStud.jsp";
		}
		
		@RequestMapping(path = "/getStudent")
		
			public ModelAndView getStud(@RequestParam String aid){
			int id = Integer.parseInt(aid);
			Student found = srp.findById(id).orElse(new Student());
			//System.out.println(found);
			ModelAndView mv = new ModelAndView("data.jsp");
			mv.addObject(found);
			return mv;
		}
		
		//I want in Json format simply remove .toString() and add List<User> getUser()
		@RequestMapping("/allRecord")
		//@ResponseBody this will say i show data not view 
		@ResponseBody
		public Iterable<Student> getUsers() {
				
				//It will return all data is present in the database.
				return srp.findAll();
		}
		
		
		
		
		
		
		
}
