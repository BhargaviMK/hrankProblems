package com.bannusb.firstapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("home1")
//@ResponseBody - it returns the string "home.jsp", but won't show the home.jsp page directly
//Add Tomcat jasper dependency to pom.xml
	
	//Approach1
	public String home1(String name, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "home";
	}

	//Approach2
	@RequestMapping("home2")
	public String home2(@RequestParam("name") String name, HttpSession session)
	{
		session.setAttribute("name", name);
		return "home";
	}
	
	//Approach3 -- single param
		@RequestMapping("home3")
		public ModelAndView home3(@RequestParam String name)
		{
			ModelAndView mv = new ModelAndView();
			mv.addObject("name", name);
			mv.setViewName("home");
			return mv;
		}

		
		//Approach4 --multiple params as model object
		@RequestMapping("home")
		public ModelAndView home(Alien aObj)
		{
					ModelAndView mv = new ModelAndView();
					mv.addObject("aObj", aObj);
					mv.setViewName("home");
					return mv;
		}

}
