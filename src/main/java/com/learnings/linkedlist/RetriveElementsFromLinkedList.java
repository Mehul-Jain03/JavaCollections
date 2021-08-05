package com.learnings.linkedlist;

import java.util.LinkedList;

public class RetriveElementsFromLinkedList {

	public static void main(String[] args) {

		LinkedList<String> brands = new LinkedList<String>();

		brands.add("Levis"); //0
		brands.add("H and M"); //1
		brands.add("Killer"); //2
		brands.add("US Polo"); //3
		
		//get(index) to retrieve at particular index
		System.out.println(brands.get(1));
		
		//getFirst to retrieve the first element
		System.out.println(brands.getFirst());
		
		//getLast to retrieve the last element
		System.out.println(brands.getLast());
	}

}
