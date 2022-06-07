package com.brillio.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo5Maps2 {

	public static void main(String[] args) {
		
		//1st row
		HashMap<String, String> map1=new HashMap<String,String>();
		map1.put("firstname","peter");
		map1.put("lastname","paul");
		map1.put("dob","4/8/22");
		
		
		HashMap<String, String> map2=new HashMap<String,String>();
		map2.put("firstname","john");
		map2.put("lastname","wick");
		map2.put("dob","4/6/22");
	
		
		List<HashMap<String, String>> lists=new ArrayList<HashMap<String, String>>();
		lists.add(map1);
		lists.add(map2);
		
		String firstname=lists.get(1).get("firstname");
		System.out.println(firstname);
		
		String dob=lists.get(1).get("dob");
		System.out.println(dob);
		
		String firstname1=lists.get(0).get("firstname");
		System.out.println(firstname1);
		
	}
}
