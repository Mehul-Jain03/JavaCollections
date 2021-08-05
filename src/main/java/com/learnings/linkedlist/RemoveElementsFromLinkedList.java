package com.learnings.linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> brands = new LinkedList<String>();

		brands.add("Levis"); //0
		brands.add("H and M"); //1
		brands.add("Killer"); //2
		brands.add("US Polo"); //3
		brands.add("Mast and Harbour"); //4
		brands.add("Wrangler"); //5
		
		//remove Method used to remove the first element from the list // if list is empty : NoSuchElementException
		System.out.println(brands.remove()); 
		
		//remove(index) Method used to remove the element from the list at specific index // if list is empty : NoSuchElementException 
		System.out.println(brands.remove(0));
		
		//removeFirst Method used to remove the first element from the list // if list is empty : No Such Element Exception
		System.out.println(brands.removeFirst());
		
		//removeLast Method used to remove the last element from the list // if list is empty : No Such Element Exception
		System.out.println(brands.removeLast());
		
		//remove(Object) Method returns true if this list contained the specified element and is removed
		System.out.println(brands.remove("US Polo"));
		
		System.out.println(brands);

	}

}
