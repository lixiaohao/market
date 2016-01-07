/**
 * 
 */
package com.market.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 	LiXiaoHao
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {

	@RequestMapping(value="index")
	public String index(){
		System.out.println("½øÀ´ÁË!");
		return "index";
	}
}
