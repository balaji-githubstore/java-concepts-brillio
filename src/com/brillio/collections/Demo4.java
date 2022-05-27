package com.brillio.collections;

import java.util.ArrayList;
import java.util.List;

import com.brillio.employee.Employee;
//generic type
public class Demo4 {

	public static void main(String[] args) {
		
		List<Integer> lists=new ArrayList<Integer>();
		
		lists.add(9);
		lists.add(0);
		lists.add(7);
		lists.add(8);
	
		System.out.println(lists.get(1));
	}
}



