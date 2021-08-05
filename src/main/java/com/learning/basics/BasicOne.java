package com.learning.basics;

public class BasicOne {

	static int a = 20;

	public BasicOne() {
		a = 10;
	}
	
	public BasicOne(int a) {
		this.a = a;
	}

	public static void initialize() {
		a = 30;
	}

	public static void main(String[] args) {
		// We can not call static variable directly in non static methods we need to create object and call
		// System.out.println(a);
		System.out.println(a);
		initialize();
		System.out.println(a);
		
//		int i = 8;
//		String srt  = String.valueOf(i); // int to String
//		System.out.println(srt);
//		
//		String s = "3";
//		int j = Integer.parseInt(s); // String to int
//		System.out.println(j);
		
		
	}
}