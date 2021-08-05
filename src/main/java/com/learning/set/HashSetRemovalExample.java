package com.learning.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemovalExample {

	public static void main(String[] args) {

		Set<String> students = new HashSet<String>();
		students.add("kapil");
		students.add("Kailash");
		students.add("Karan");
		students.add("Kartik");
		students.add("keshav");
		students.add("Kaushal");

		System.out.println(students);

		// remove(object) Used to remove the object at particular object.
		students.remove("kapil");

		System.out.println(students);

		Set<String> failedStudents = new HashSet<String>();
		failedStudents.add("Karan");
		failedStudents.add("Kartik");

		// removeAll(object) Used to remove the all the objects.
		System.out.println(students.removeAll(failedStudents));

		System.out.println(students);

		// clear Method is used to clear the whole set object.
		students.clear();
		System.out.println(students);

	}
}