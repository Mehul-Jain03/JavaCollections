package com.learning.basics;

public class MethodOverriding {

	public static void main(String[] args) {

		Base b = new Derived();
		System.out.println(b.getSalary());

	}

}

class Base {

	int baseSalary = 10000;

	public int getSalary() {
		return baseSalary;
	}

}

class Derived extends Base {

	@Override
	public int getSalary() {
		return baseSalary + 10000;
	}

	public void printStatement() {
		System.out.println("This is Derived Class");
	}

}