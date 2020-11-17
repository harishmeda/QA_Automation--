package com.PKGlobal.Java.Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorPractise {

	static String[] inputList = { "January", "February", "March", "April", "May", "June", "July", "august", "September",
			"October", "november", "December" };

	public static void main(String[] args) {

		List<String> months = Arrays.asList(inputList);
		
		Vector<String> vMonths = new Vector<String>(months);
		
		System.out.println("Unsorted Vector: " + vMonths);
		Collections.sort(vMonths);
		System.out.println("Sorted Vector: " + vMonths);
		 Collections.sort(vMonths, String.CASE_INSENSITIVE_ORDER);
		//vMonths.sort(String::compareToIgnoreCase);
		System.out.println("Sorted Vector with case senstive: " + vMonths);

	}

}
