package com.learnings.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(34);
		list.add(76);
		list.add(91);
		list.add(12);
		list.add(34);
		list.add(32);
		
		//Sorting Using Collections Class sort Method - By Default it sort in ascending order.
		Collections.sort(list); //ascending
		
		//Reverse Using Collections Class reverse Method
		Collections.reverse(list); //
		
		list.forEach((integer) -> System.out.print(integer+" "));
		
	}

}
