package online.qsx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import online.qsx.model.StudentModel;
import online.qsx.service.StudentServer;

@Controller
@RequestMapping(value="student")
public class StudentController {

	@Autowired
	private StudentServer studentServer;
	
	@RequestMapping(value="list",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView students(StudentModel studentModel,@RequestParam(defaultValue="1")int pageNum,ModelAndView modelAndView) {
		modelAndView.addObject("pageinfo",studentServer.getStudents(studentModel, pageNum, 5));
		modelAndView.setViewName("index");
		return modelAndView;
		
	}
	
	@RequestMapping(value="to_add")
	public ModelAndView to_add(ModelAndView modelAndView){
		modelAndView.setViewName("add");
		return modelAndView;
	}
	
	@RequestMapping(value="do_add")
	public ModelAndView do_add(StudentModel studentModel,ModelAndView modelAndView){
		studentServer.addStudent(studentModel);
		modelAndView.setViewName("index");
		return students(null,1,modelAndView);
	}
	
	@RequestMapping(value="do_delete")
	public ModelAndView do_delete(int studentno,ModelAndView modelAndView){
		studentServer.deleteStudent(studentno);
		modelAndView.setViewName("index");
		return students(null,1,modelAndView);
	}
	
	@RequestMapping(value="to_update")
	public ModelAndView to_update(int studentno,ModelAndView modelAndView){
		modelAndView.addObject("student", studentServer.getStudent(studentno));
		modelAndView.setViewName("update");
		return modelAndView;
	}
	
	@RequestMapping(value="do_update")
	public ModelAndView do_update(StudentModel studentModel,ModelAndView modelAndView){
		studentServer.updateStudent(studentModel);
		modelAndView.setViewName("index");
		return students(null,1,modelAndView);
	}
	
	@RequestMapping(value="to_select")
	public ModelAndView to_select(int studentno,ModelAndView modelAndView){
		modelAndView.addObject("student", studentServer.getStudent(studentno));
		modelAndView.setViewName("info");
		return modelAndView;
	}

}
