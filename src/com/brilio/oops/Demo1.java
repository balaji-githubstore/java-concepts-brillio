package com.brilio.oops;


class Father{
	public int fatherAge;
	
	public Father(int fAge)
	{
		this.fatherAge=fAge;
		System.out.println("Father");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style");
	}
}

class Son extends Father
{
	public int sonAge=30;
	
	public Son(int fAge,int sAge)
	{
		super(fAge);
		this.sonAge=sAge;
		System.out.println("son");
		
	}
	
	public void sonStyle()
	{
		System.out.println("son style");
	}
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		Son s=new Son(68,30);
		s.fatherStyle();
		s.sonStyle();
		
	}

}
