package com.registration.form.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.registration.form.model.Address;
import com.registration.form.model.OnlineForm;
import com.registration.form.repository.UserRepo;
import com.registration.form.services.Services1;
import com.registration.form.services.Services2;

@Controller

public class HomeController {
	@Autowired
	Services1 sv;
	@Autowired
	Services2 sv1;
	
	@RequestMapping("/")
	public String mama()
	{
		return "reg.jsp";
	
	}
	
	@RequestMapping(value = "/" , method = RequestMethod. POST)
	public String editCustomer(@RequestParam("material")String[] checkboxValue,@ModelAttribute("OnlineForm")OnlineForm of,@ModelAttribute("address")Address as) 
	{
		List<Address> las=new ArrayList<Address>();
		las.add(as);
		of.setAddress(las);
		of.setMaterial(checkboxValue);
		of.setDob(sv1.dateChange(of.getDob()));
		if(!sv1.checkEmail(of))
		{
			System.out.println(of);
			sv.save(of);
			return "sucess.jsp";
		}
		else 
			return "unsuccessful.jsp";
	}
	
	

}
