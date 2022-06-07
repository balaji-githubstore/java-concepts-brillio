package com.brillio.collections;

import java.util.HashMap;

public class Demo5Maps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		map1.put(101, "john");
		map1.put(102, "peter");
		map1.put(103, "paul");
		map1.put(103, "king");
		
		System.out.println(map1.get(102));
		
		
		HashMap<String, String> map2=new HashMap<String,String>();
		map2.put("john","Manager");
		map2.put("peter","QA");
		map2.put("paul","developer");
	
		
		System.out.println(map2.get("john"));
		
	}
}
