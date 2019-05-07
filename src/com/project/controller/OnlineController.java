package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Model.Shop;

@Controller
public class OnlineController {

	@Autowired
	ShopService service;

	@Autowired
	HttpServletRequest request;
		
	@RequestMapping("/")
	public String summa(Model theModel) {
		theModel.addAttribute("stu",new Shop());
		return "register";
	}

	@PostMapping("/insertUser")//@GetMapping("")
	public String insertUser(@ModelAttribute("stu") Shop s1,Model theModel) {
		service.createStudent(s1);
		List<Shop> students = service.getShop());
		theModel.addAttribute("students",students);
		return "login";
	}

	@RequestMapping("/read")
	public String read(Model theModel) {
		List<Shop> students = service.getShop();
		theModel.addAttribute("students",students);
		return "success";
	}

	@RequestMapping("/editStudent")
	public String editStudent(@RequestParam("id") String id,Model theModel) {
		theModel.addAttribute("stu",service.getShop(id));
		return "home";
	}


	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") String id) 
	{
		Shop s1 = service.getShop(id);
		service.deleteShop(s1);
		return "redirect:/read";
	}


	}

