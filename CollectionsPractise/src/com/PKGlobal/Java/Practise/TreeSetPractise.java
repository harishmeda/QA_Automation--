package com.PKGlobal.Java.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetPractise {
	
	

	
	static String[] inputList = { "January", "February", "March", "April", "May", "June", "July", "august", "September",
			"October", "november", "December" };

	public static void main(String[] args) {

	List<String> monthsList=new ArrayList<String>( Arrays.asList(inputList) );
	
	    TreeSet<String> TSmonths = new TreeSet<String>(monthsList);
		System.out.println("sorted TreeSet: " + TSmonths);
		
		List<String> monthst=new ArrayList<String>(TSmonths);
		monthst.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(monthst);
		
		
		
		
		
}
}