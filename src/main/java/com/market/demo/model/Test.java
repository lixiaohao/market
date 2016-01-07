package com.market.demo.model;
import java.util.List;


public class Test extends Base<String> {
   
	public static void main(String[] args) {
		Test t = new Test();
		List<Position> ls = t.getEntity(Position.class, 1);
		for (Position position : ls) {
			System.out.println("position:"+position);
		}
//		List<String> ls = new ArrayList();
//		ls.add("d");
//		List<Object> lo = new ArrayList<Object>();	
//		List<String> ls = new ArrayList<String>();
//		lo = ls;//<---此外语法编译不过	
	}
}
