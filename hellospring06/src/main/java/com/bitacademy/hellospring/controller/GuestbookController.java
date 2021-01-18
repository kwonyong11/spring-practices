package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author user
 *
 * @RequestMapping 예제
 * Class 단독 매핑
 * 
 */
@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "GuestbookController:list";
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "GuestbookController:delete";
	}
}
