package com.ocac.mavensample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPPageController {

	@RequestMapping(value={"/index","/"})
	public ModelAndView view()
	{
		ModelAndView mov=new ModelAndView("index");
		return mov;
	}
	@RequestMapping(value={"/about"})
	public ModelAndView view1()
	{
		ModelAndView mov=new ModelAndView("aboutus");
		return mov;
	}
	
	@RequestMapping(value={"/login"})
	public ModelAndView view3()
	{
		ModelAndView mov=new ModelAndView("login");
		return mov;
	}

	@RequestMapping(value={"/register"})
	public ModelAndView view12()
	{
		ModelAndView mov=new ModelAndView("register");
		return mov;
	}
	@RequestMapping(value={"/products"})
	public ModelAndView view4()
	{
		ModelAndView mov=new ModelAndView("products");
		return mov;
	}
	
	@RequestMapping(value={"/Men"})
	public ModelAndView view5()
	{
		ModelAndView mov=new ModelAndView("Men");
		return mov;
	}
	@RequestMapping(value={"/Women"})
	public ModelAndView view6()
	{
		ModelAndView mov=new ModelAndView("Women");
		return mov;
	}
	@RequestMapping(value={"/Kids"})
	public ModelAndView view7()
	{
		ModelAndView mov=new ModelAndView("Kids");
		return mov;
	}
	@RequestMapping(value={"/Sports"})
	public ModelAndView view8()
	{
		ModelAndView mov=new ModelAndView("Sports");
		return mov;
	}
	@RequestMapping(value={"/NikeSportswear"})
	public ModelAndView view9()
	{
		ModelAndView mov=new ModelAndView("Nike Sportswear");
		return mov;
	}
	@RequestMapping(value={"/NikeId"})
	public ModelAndView view10()
	{
		ModelAndView mov=new ModelAndView("NikeId");
		return mov;
	}
	@RequestMapping(value={"/Contactus"})
	public ModelAndView view11()
	{
		ModelAndView mov=new ModelAndView("Contactus");
		return mov;
	}
	
}
