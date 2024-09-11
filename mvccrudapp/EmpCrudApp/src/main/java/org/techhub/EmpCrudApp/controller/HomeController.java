package org.techhub.EmpCrudApp.controller;
import java.util.Map;
import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.EmpCrudApp.Model.DeptModel;
import org.techhub.EmpCrudApp.Service.DeptService;

@Controller
public class HomeController {
	@Autowired
	 DeptService deptService;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	 @RequestMapping("/newdept")
	 public String homeController() {
		 return "adddept";
	 }
	 @RequestMapping("/save")
	 public String saveDept(final DeptModel model,Map map) {
		 boolean b=deptService.isAddDept(model);
		 if(b) {
			 map.put("msg","Dept Added Successfully............");
		 }
		 else {
			 map.put("dept","Some problem is there.................");
		 }
		 return "adddept";
	 }
	 @RequestMapping("/viewd")
	 public String getAllDepts(Map<String,List<DeptModel>> map){
		 List<DeptModel>list=this.deptService.getAllDepts();
		 map.put("deptList", list);
		 
		 return "viewdept";   //viewdeptjsp
	 }
}
