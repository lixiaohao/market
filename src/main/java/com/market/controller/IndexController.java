/**
 * 
 */
package com.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiXiaoHao
 *
 */
@Controller
@RequestMapping("angular")
public class IndexController {
	
	@RequestMapping("angular")
	public String index(){
		return "angular";
	}
}
