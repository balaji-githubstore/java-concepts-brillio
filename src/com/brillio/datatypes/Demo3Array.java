package com.brillio.datatypes;

public class Demo3Array {

	public static void main(String[] args) {

		// 30,40,50,60,70

		int[] numbers = new int[5];// 5*32 bits of memory

		numbers[0] = 30;
		numbers[1] = 40;
		numbers[2] = 50;
		numbers[3] = 60;
		// numbers[4]=70;
		
		numbers=new int[10];

		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);

		// create array for 45.6,78,90.5
		double[] arr = new double[3]; //3*64 bits
		arr[0] = 45.6;
		arr[1] = 78;
		arr[2] = 90.5;

		System.out.println(arr);
		System.out.println(arr[0]);

		int[] arr1 = { 40, 54, 98, 65 };// 4*32 bits of memory

		System.out.println(arr1[1]);
		
		//for storing red,green,yellow
		String[] colors=new String[3]; 
		
		colors[0]="red";
		colors[1]="green";
		//colors[2]="yellow";
		
		//14*16 bits of memory
		
		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		String[] arr2= {"red","yellow","green"};
		String[][] main={{"john","john123"},{"peter","peter123"},{"mark","mark123"}};
		System.out.println(main[2][1]);
		
		int[][] twoArr= {{10,20},{100,200}};
		System.out.println(twoArr[1][1]);
	}

}




