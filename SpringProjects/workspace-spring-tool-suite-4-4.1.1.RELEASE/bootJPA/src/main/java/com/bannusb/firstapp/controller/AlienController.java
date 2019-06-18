package com.bannusb.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bannusb.firstapp.dao.AlienRepository;
import com.bannusb.firstapp.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepository arepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home"; //add jasper dependency to support jsp pages by spring boot
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien a)
	{
		arepo.save(a);
		return "home"; 
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(int aid)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("alien", arepo.findById(aid).orElse(new Alien()));
		return mv; 
	}
	
	@RequestMapping("/updateAlien")
	public String updateAlien(Alien newAlien)
	{
		
		arepo.save(newAlien);
		return "home";
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(int aid)
	{
		
		arepo.deleteById(aid);
		return "home";
	}
	
	//complex queries
	@RequestMapping("/getAlienByTech")
	public ModelAndView getAlienByTech(String lang)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("alien", arepo.findByAlang(lang));
		return mv; 
	}
}
