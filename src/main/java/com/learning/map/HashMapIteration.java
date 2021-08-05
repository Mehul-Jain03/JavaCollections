package com.learning.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {

		Map<String, Integer> courses = new HashMap<String, Integer>();

		courses.put("Java", 1800);
		courses.put("Python", 9000);
		courses.put("Ruby", 2300);
		courses.put("Devops", 4800);
		courses.put("Automation", 5800);
		courses.put("Data Science", 9800);
		courses.put("RPA", 4500);
		courses.put("Database", 1400);

		//For Each
		for (Map.Entry<String, Integer> course : courses.entrySet()) {
			System.out.println(course.getKey() + " : " + course.getValue());
		}

		// Iterator
		Set<Entry<String, Integer>> course = courses.entrySet();
		Iterator<Entry<String, Integer>> itr = course.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//Lambda Expression
		courses.forEach((K, V) -> {
			System.out.println("k " + K);
			System.out.println("v " + V);
		});
		
		//Stream API
		courses.entrySet().stream().forEach((entry) -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		});

	}

}
