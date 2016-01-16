/**
 * 
 */
package com.market.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.demo.model.Position;
import com.market.demo.service.PositionService;

/**
 * @author 	LiXiaoHao
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private PositionService positionService;
	
	@RequestMapping(value="index")
	public String index(){
		System.out.println("½øÀ´ÁË!");
		
		List<Position> pList = new ArrayList<Position>();
		pList = positionService.findAll();
		System.out.println("-----");
		for(Position p:pList){
			System.out.println(p.toString());	
		}
		
		return "index";
	}
}
