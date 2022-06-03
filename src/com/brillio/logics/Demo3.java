package com.brillio.logics;

public class Demo3 {

	public static void main(String[] args) {
		
		
		String name="hello";
		String name1="hello";
		String name2=new String("hello");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name==name1); //compare location and then text
		System.out.println(name==name2); 
		
		System.out.println(name.equals(name2)); //compare text
	}
}
