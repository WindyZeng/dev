package com.mod.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mod.user.service.UserService;

@Controller
public class UserController {
	@Resource UserService userService;
	
	//ajax �û���У���Ƿ�ע��
	@RequestMapping(value = "/ajaxValidateLoginName", method = RequestMethod.POST)
	public  @ResponseBody String ajaxValidateLoginname(@RequestParam("loginName") String loginName, ModelMap modelMap){
		//ͨ��service�õ�У����
		boolean b = userService.ajaxValidateLoginname(loginName);
		ModelAndView mav = new ModelAndView();    
		mav.addObject("checkAjaxLoginName",b);
		return "regist";
	}
	
	//ajax emailУ���Ƿ�ע��
	@RequestMapping(value = "/ajaxValidateEmail", method = RequestMethod.POST)
	public @ResponseBody String ajaxValidateEmail(@RequestParam("email") String email, ModelMap modelMap){
		boolean b = userService.ajaxValidateEmail(email);
		ModelAndView mav = new ModelAndView();    
		mav.addObject("checkAjaxEmail",b);
		return "regist";
	}
	
	
	
}
