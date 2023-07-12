package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.Donors;
import com.cts.service.DonorsService;

@Controller
public class HemoCareController {
	
	@Autowired
	private DonorsService donorsService;
	
	@GetMapping("/")
	public ModelAndView showIndexPage() {
	
		ModelAndView mv = new ModelAndView("index");
		
		List<Donors> donors = donorsService.getAll();
		mv.addObject("donors", donors);
		return mv;
		
		
	}

	public DonorsService getDonorsService() {
		return donorsService;
	}

	public void setDonorsService(DonorsService donorsService) {
		this.donorsService = donorsService;
	}

}
