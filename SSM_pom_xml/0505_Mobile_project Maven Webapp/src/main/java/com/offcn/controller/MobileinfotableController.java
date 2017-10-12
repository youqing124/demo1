package com.offcn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offcn.po.Mobileinfotable;
import com.offcn.service.MobileinfotableService;

@Controller
public class MobileinfotableController {

	
	@Resource()
	MobileinfotableService  mobileinfotableService;
	
	@RequestMapping("/selectNumber")
	public  String selectArea(Model model,@RequestParam String mobileNumber){
		Mobileinfotable mobileinfotable=mobileinfotableService.getAreaById(mobileNumber);
		System.out.println(mobileinfotable);
		model.addAttribute("mobileinfotable", mobileinfotable);
		
		return "login2";
	}
	
	//http://localhost:8080/0505_Mobile_project/selectNumber?name=1300006
	
	
	
	
	
	
	
	
	
	
	
	
}
