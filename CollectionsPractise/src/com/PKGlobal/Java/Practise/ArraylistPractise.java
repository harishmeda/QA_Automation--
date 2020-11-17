package com.PKGlobal.Java.Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistPractise {

	static String[] inputList = { "January", "February", "March", "April", "May", "June", "July", "august", "September",
			"October", "november", "December" };

	public static void main(String[] args) {

		List<String> months = Arrays.asList(inputList);
		System.out.println("Unsorted List: " + months);
		Collections.sort(months);
		System.out.println("sorted List: " + months);
		Collections.sort(months, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Sorted List with case senstive: " + months);

		Iterator it = months.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}