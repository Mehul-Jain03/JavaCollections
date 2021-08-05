package com.learnings.linkedlist;

import java.util.LinkedList;

public class LinkedListIteration {

	public static void main(String[] args) {

		LinkedList<String> brands = new LinkedList<String>();

		brands.add("Levis"); // 0
		brands.add("H and M"); // 1
		brands.add("Killer"); // 2
		brands.add("US Polo"); // 3
		brands.add("Mast and Harbour"); // 4
		brands.add("Wrangler"); // 5
		brands.add("US Polo"); // 6

		// contains Method Returns True if the element is present in the list
		System.out.println(brands.contains("H and M"));
		System.out.println(brands.contains("Mufti"));

		// indexOf Method returns the index of first occurrence of element or -1 if this
		// list does not contain the element
		int index = brands.indexOf("US Polo");
		System.out.println("First Occurence of US Polo => " + index);

		// lastIndexOf Method returns the index of last occurrence of element or -1 if
		// this list does not contain the element
		System.out.println(brands.lastIndexOf("Mehul"));

	}

}
