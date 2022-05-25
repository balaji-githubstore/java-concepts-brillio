package com.brillio.loops;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 101 };

		// print values which are greater than or equal to 50
		for (int a : numbers) 
		{
			if(a==50)
			{
				continue;
			}
			System.out.println(a);
		}

	}

}
