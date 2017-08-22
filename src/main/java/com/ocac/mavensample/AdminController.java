package com.ocac.mavensample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ocac.DAO.RegisterDAO;
import com.ocac.model.Register;





@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	RegisterDAO pDAO;

	
	@RequestMapping(value = "/pro")
	@ResponseBody
	public List<Register> getAllProducts() {

		return pDAO.getAll();
	}
    
	
	
	

	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)//method level url
	public String adminSave(@ModelAttribute("register") Register register, BindingResult results, Model model) 
	{
		if (results.hasErrors()) {
			model.addAttribute("register", new Register());
			
			return "register";
		}
		if(register.getId()==0)
		{
			pDAO.insert(register);
		}
		else{
			pDAO.update(register);
		}
		
		return "redirect:/admin/register";
	}
	
	
}
