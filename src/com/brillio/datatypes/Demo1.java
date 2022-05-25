package com.brillio.datatypes;

public class Demo1 {

	public static void main(String[] args) {

		int z;

		z = 0;

		System.out.println(z);

		byte a = 100; // a will be registered for byte (8 bits)

		short b = 100; // b will be registered fo short (16 bits)

		int c = 100; // 32 bits

		long d = 78787788787L; // 64 bits

		// 1000 students percentange

		// byte - 1000*8 = 8000 bits of memory
		// int - 1000*32 = 32000 bits of memory

		float e = 10.2f;

		double f = 10.2;

		double res = 45.3 * 8989 * 545454;
		System.out.println(res);

		char letter = 'j'; // 16bits of mem
		System.out.println(letter);

		System.out.println(a);
		System.out.println(e);

		boolean check = true;
		System.out.println(check);

		float x1 = 10.123456789f;
		double x2 = 10.123456789; // 64 bit

		double y1 = x1; // 32 bit to 64 bit - implicit conversion - no data loss
		System.out.println(y1);

		float y2 = (float) x2; // 64 bits to 32 bits - explicit conversion - data loss
		System.out.println(y2);

		double i = 10.2;

		int i1 = (int) i; // double to int

		System.out.println(i1);

		

		// array
		// artithemetic operation
		int radius = 10;

		double result = 3.14 * radius * radius;

		System.out.println(result);

		
		String name = "Balaji"; // 6*16 bits of memory
		
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(10)); 
	}

}
