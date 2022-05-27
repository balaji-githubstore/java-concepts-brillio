package com.brillio.collections;

import java.util.ArrayList;

import com.brillio.employee.Employee;

public class Demo1Object {

	public static void main(String[] args) {
		
		int a=10;
		double b=10.2;
		String c="hello";
		Employee e=new Employee();
		
		Object z="sss"; //boxing
		
		String res=(String) z; //unboxing
		System.out.println(res);
		
		
	}
}
