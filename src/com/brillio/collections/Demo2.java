package com.brillio.collections;

import java.util.ArrayList;

import com.brillio.employee.Employee;
//non-generic type
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList lists=new ArrayList();
		
		lists.add(10);
		lists.add(10.2);
		lists.add("hello"); //boxing
		
		String name=(String) lists.get(0); //unboxing
		System.out.println(name);
	}
}
