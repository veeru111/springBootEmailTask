package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.Model.GmailModel;
import com.app.util.MailUtil;

@Controller
@RequestMapping("/product")
public class GmailController {
	
	@Autowired
	private MailUtil email;
	
	@RequestMapping("/show")
	public String home(Model map) {
		
		map.addAttribute("gmailModel",new GmailModel());
		System.out.println("inside the home controlller");
		
		return "Gmail";
		
	}
	
	@RequestMapping(value="/send",method=RequestMethod.POST)
	public String send(@RequestParam MultipartFile file,@ModelAttribute GmailModel gmail,Model map ) {
		
		boolean f=email.send(gmail.getTo(), gmail.getSub(), gmail.getText(), gmail.getCc(), gmail.getCc(), file);
	if(f)
		map.addAttribute("message","suceefuly send mail");
	else
		map.addAttribute("message","Message not send");
	
	
		map.addAttribute("gmailModel",new GmailModel());
	
		return "Gmail";
	}
	
	

}
