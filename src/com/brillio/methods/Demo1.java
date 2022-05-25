package com.brillio.methods;

import com.brillio.area.Area;

public class Demo1 {

	public static void main(String[] args) {
		
		
		Area obj=new Area();
		
		int radius = 10;
		
		double result= obj.areaOfCircle(10);
		System.out.println(result);

		result= obj.areaOfCircle(20);
		System.out.println(result);
		
		double output=Area.areaOfTriangle(10.2, 12.2);
		System.out.println(output);
		
		String authorName=Area.getAuthorName();
		System.out.println("AuthorName is "+authorName);
		
		Area.printClassDescription();
		
		double random=Math.random();
		System.out.println(random);
		
		String title=Area.getTitle();
		System.out.println(title);
		
		obj.printTitle();
		
		//check for methods 
		//pow
		//max
	}

}
