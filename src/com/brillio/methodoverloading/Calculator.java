package com.brillio.methodoverloading;

public class Calculator {

	public Calculator()
	{
		System.out.println("object created!!");
	}
	
	public static void printName()
	{
		System.out.println("Caculator class!!!");
	}
	
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, int b) {
		System.out.println(a + b);
	}
}
