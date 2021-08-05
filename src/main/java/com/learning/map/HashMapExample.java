package com.learning.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	// Duplicates are not allowed. Null Values are allowed, Null Keys are also
	// allowed. Key's Should be different, values could be same.
	// if keys are same and values are different then the latest value of that key
	// would be assigned (Means Single null and key and multiple null values)

	public static void main(String[] args) {
		

		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.putIfAbsent("Four", null);
		hm.put("Five", null);
		System.out.println(hm);

		// size method to give the size of the hashmap
		System.out.println(hm.size());

		// isEmpty method to return true if the map is empty
		System.out.println(hm.isEmpty());

		// containsKey method to return true if the map contains that key
		System.out.println(hm.containsKey("Three"));

		// containsValue method to return true if the map contains that value
		System.out.println(hm.containsValue(2));

		// get - Returns the value to which the key is mapped
		System.out.println(hm.get("Two"));

		// remove Method removes the Key
		hm.remove("Three");
		System.out.println(hm.size());

		// keySet - Method Returns the keys available in the map. Set is the return type
		// because keys can't be duplicate
		Set<String> keys = hm.keySet();
		System.out.println(keys);

		// values - Method Returns the values available in map. Collection is the return
		// type because values can be duplicate
		Collection<Integer> al = hm.values();
		System.out.println(al);

	}

}
