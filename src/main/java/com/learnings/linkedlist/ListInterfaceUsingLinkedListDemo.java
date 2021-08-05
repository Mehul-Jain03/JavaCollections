package com.learnings.linkedlist;

import java.util.LinkedList;

public class ListInterfaceUsingLinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> brands = new LinkedList<String>();

		// add Method to add elements in the list
		brands.add("Levis");
		brands.add("H and M");
		brands.add("Killer");
		brands.add("US Polo");
		brands.add("Killer");
		brands.add(null);

		System.out.println("Size of Linked List : " + brands.size());
		System.out.println("Linked List is : " + brands);

		// add(index,element) Method to add elements in the list at specific position
		brands.add(1, "Lee");
		System.out.println("Linked List is : " + brands);

		// addFirst Method to add elements in the beginning
		brands.addFirst("Jhon Player");
		System.out.println("Linked List is : " + brands);
		
		//addLast  Method to add elements in the end
		brands.addLast("Being Human");
		System.out.println("Linked List is : " + brands);
		
	}

}
