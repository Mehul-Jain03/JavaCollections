package com.learnings.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceUsingArrayListDemo {

	/*
	 * List is an ordered collection which maintains the insertion order. List
	 * Provides control over the position where you can insert an element. You Can
	 * Insert an element by an index and search elements by an index. List allows
	 * you to add duplicates. List allows you to add null elements. List index start
	 * from zero, just like array.
	 */

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// add Method to add the Objects of given generics type
		// checking for duplicates and null elements addition properties and also
		// insertion order properties

		list.add("element1");
		list.add("element2");
		list.add("element1");
		list.add("element2");
		list.add(null);
		list.add(null);
		list.add("element2");
		System.out.println(list);
		System.out.println("The Size of this list is : " + list.size());

		// checking the insertion at given index
		list.add(1, "element3");
		System.out.println(list);
		System.out.println("The Size of this list is : " + list.size());

		// it will set this given element at particular position
		list.set(0, "element4");
		System.out.println(list);

		// handling out of out out of bound exception
		try {
			System.out.println(list.get(9));
		} catch (Exception e) {

		}

		// lastIndexOf method is used the last occurrence of that element
		System.out.println("The last Index of this object is : " + list.lastIndexOf("element2"));

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// remove Method - by index
		list.remove(0);
		System.out.println("The Size of this list is : " + list.size());

		// remove Method - by object
		list.remove(null);
		System.out.println("The Size of this list is : " + list.size());

		// There are 2 Methods Clear and Remove all : return type of clear is void while
		// of removeAll is boolean. clear takes no arguments
		// while removeAll takes collection as arguments.

		// removeAll - Takes the collection as the arguments
		List<String> fruits = new ArrayList<String>();
		fruits.add("Dragon Fruits");
		fruits.add("Pomegranate");
		System.out.println("fruits size is : " + fruits.size());
		boolean removes = fruits.removeAll(fruits);
		System.out.println("fruits size is : " + fruits.size());
		System.out.println(removes);

		// clear Method - used to clear all the elements from the list.
		fruits.add("Watermelon");
		fruits.clear();

		// Iterating The List
		List<String> courses = Arrays.asList("C#", "Hindi", "English", "Java", "Karate");

		// Using Basic For Loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}

		// Using Enhanced For Loop
		for (String course : courses) {
			System.out.println(course);
		}

		// Using Basic Loop with Iterator
		for (Iterator<String> itr = courses.iterator(); itr.hasNext();) {
			String cour = (String) itr.next();
			System.out.println(cour);

		}

		// Using While loop with Iterator
		Iterator<String> itrr = courses.iterator();
		while (itrr.hasNext()) {
			System.out.println((String) itrr.next());
		}

		// Java 8 For Each with Lambda
		System.out.println("***************For Each with Lambda*************");
		courses.forEach((courr) -> System.out.println(courr));

		// Java 8 For Each with Stream
		System.out.println("***************For Each with Stream and Lambda*************");
		courses.stream().forEach(courrr -> System.out.println(courrr));
	}

}