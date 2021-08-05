package com.learnings.JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceUsingArrayListDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollections = new ArrayList<String>();
		Collection<String> fruitCollectionsNew = new ArrayList<String>();
		
		// add Method to add the Objects of given generics type
		fruitCollections.add("Banana");
		fruitCollections.add("Mango");
		fruitCollections.add("Apple");
		fruitCollections.add("Cherry");
		fruitCollections.add("Grapes");
		fruitCollections.add("Straberry");
		
		fruitCollectionsNew.add("Cherry");
		fruitCollectionsNew.add("Grapes");
		fruitCollectionsNew.add("Straberry");
		fruitCollectionsNew.add("Kiwi");
		
		System.out.println(fruitCollections);

		// remove Method to Remove the given object
		fruitCollections.remove("Banana");
		// fruitCollections.remove("Papaya"); // if not found, it does not throw any error.

		System.out.println(fruitCollections);

		// contains Method to check the availability of given object
		System.out.println(fruitCollections.contains("Apple"));
		System.out.println(fruitCollections.contains("Papaya"));
		
		
		// removeAll Method is used to remove the objects of one collections into different collection if it contains those objects
		fruitCollections.removeAll(fruitCollectionsNew);
		System.out.println(fruitCollections);
		
		// forEach its type of Iterator which is used to iterate over collection objects
		fruitCollections.forEach((fruit) -> System.out.print(fruit+" "));
		
		//
		fruitCollections.clear();

	}

}
