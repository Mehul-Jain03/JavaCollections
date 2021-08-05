package com.learning.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {

	public static void main(String[] args) {

		Set<String> courses = new HashSet<String>();
		courses.add("C#");
		courses.add("Java");
		courses.add("Python");
		courses.add("Data Science");
		courses.add("Automation");

		// For Each Loop
		for (String course : courses) {
			System.out.println(course);
		}

		// For Loop with iterator
		for (Iterator<String> it = courses.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

		Iterator<String> itr = courses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		courses.forEach((course) -> System.out.println(course));

	}

}
