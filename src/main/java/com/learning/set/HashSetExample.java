package com.learning.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	// Set Allows only unique values as duplicates are not allowed
	public void doesNotContainDuplicates() {
		Set<String> hs = new HashSet<String>();
		hs.add("element1");
		hs.add("element1");
		System.out.println("After Adding 2 Elements Also the size is : " + hs.size());
		System.out.println("Set Elements are : " + hs);

	}

	// Set does not preserve the order of insertion
	public void unorderedSet() {
		Set<String> hs = new HashSet<String>();
		hs.add("element1");
		hs.add("element2");
		hs.add("element5");
		hs.add("element6");
		hs.add("element8");
		hs.add("element3");
		System.out.println("Set Elements are : " + hs);
	}

	// Set Allows only one null values as duplicates are not allowed
	public void nullCheck() {
		Set<String> hs = new HashSet<String>();
		hs.add(null);
		hs.add(null);
		hs.add("element1");
		System.out.println("Set Elements are : " + hs);
	}

	public static void main(String[] args) {

		HashSetExample ex = new HashSetExample();
		ex.doesNotContainDuplicates();
		ex.unorderedSet();
		ex.nullCheck();

	}

}