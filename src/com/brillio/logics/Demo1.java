package com.brillio.logics;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int num=10;
		
		if(num<0)
		{
			System.out.println("it's negative: "+num);
		}
		else if(num==0)
		{
			System.out.println("It's zero");
		}
		else
		{
			System.out.println("it's positive "+num);
		}
		
		int pageNum=150;
		
		//check the value is b/w 100 to 200
		
		if(pageNum>100)
		{
			if(pageNum<200)
			{
				System.out.println("Yes! b/w 100 to 200");
			}
		}
		
		if(pageNum>100  &&  pageNum<200)
		{
			System.out.println("Yes! b/w 100 to 200");
		}
		
		String browser="CH";
		
		if(browser == "ch"  || browser=="CH")
		{
			System.out.println("launch chrome");
		}
		else
		{
			System.out.println("launch edge");
		}
	}

}



