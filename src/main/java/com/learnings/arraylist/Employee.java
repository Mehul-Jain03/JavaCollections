package com.learnings.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int age, long salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(10, "Mehul", 23, 10000));
		listOfEmployee.add(new Employee(20, "Karan", 30, 50000));
		listOfEmployee.add(new Employee(30, "Rahul", 34, 40000));
		listOfEmployee.add(new Employee(40, "Jayesh", 39, 70000));

//		// Sorting Using Comparator Interface
//		System.out.println("*********Before Sorting By Salary**************");
//		for (Employee e : listOfEmployee) {
//			System.out.println(e);
//		}
//
//		Collections.sort(listOfEmployee, new MySort());
//		
//		System.out.println("*********After Sorting By Salary**************");
//		for (Employee e : listOfEmployee) {
//			System.out.println(e);
//		}
		
		//Sorting Using lambda expression and anonymous class
		Collections.sort(listOfEmployee, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		
		System.out.println(listOfEmployee);
		
		//Sorting Using lambda expression
		Collections.sort(listOfEmployee,(o1,o2) -> (int) (o2.getSalary()-o1.getSalary()));
		
		System.out.println(listOfEmployee);

	}

}

class MySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}
