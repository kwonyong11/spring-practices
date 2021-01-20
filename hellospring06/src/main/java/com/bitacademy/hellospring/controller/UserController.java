package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitacademy.hellospring.vo.UserVo;

/**
 * 
 * @author user
 * 
 * @RequestMapping 예제
 * Class + Method(Handler) 매핑(추천)
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
//	public String join(String name,String email,String password)
	public String join(UserVo vo) {
		System.out.println("UserController:join:" + vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam(value="n") String name) {
		/**
		 * 만일 n이라는 이름으로 파라미터가 전달되지 않으면 400 Bad Request 오류 발생
		 */
		System.out.println(name);
		return "UserController:update";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(
			@RequestParam(value="n", required = true, defaultValue="") String name,
			@RequestParam(value="a", required = true, defaultValue="0") int age) {
		System.out.println("---"+name+"---"+age+"---");
		return "UserController:update2";
	}
}
