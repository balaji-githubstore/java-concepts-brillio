package com.brillio.collections;

import java.util.ArrayList;
import java.util.List;

import com.brillio.employee.Employee;
//generic type
public class Demo3 {

	public static void main(String[] args) {
		
		List<String> lists=new ArrayList<String>();
		
		lists.add("green");
		lists.add("red");
		lists.add("yellow");
		lists.add("blue");
		lists.add("green");
		System.out.println(lists);
		System.out.println(lists.get(1));
		
		lists.remove("yellow");
		System.out.println(lists);
		
		lists.add(0, "orange");
		
		System.out.println(lists);
		
		System.out.println(lists.size());
		
//		for (int i=0; i<lists.size(); i++) 
//		{
//			System.out.println(lists.get(i));
//		}
//		

		for(String color : lists)
		{
			System.out.println(color);
		}
	}
}



