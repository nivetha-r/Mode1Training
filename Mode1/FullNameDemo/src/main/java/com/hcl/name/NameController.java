package com.hcl.name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	@RequestMapping("/name")
	public ModelAndView name(HttpServletRequest req,HttpServletResponse res) {
	    String fname,lname,fullname;
		fname=req.getParameter("firstName");
		lname=req.getParameter("lastName");
		fullname=fname+" "+lname;
		String result=" ";
		result+=fullname;
		return new ModelAndView("result","result",result);
	}


}
