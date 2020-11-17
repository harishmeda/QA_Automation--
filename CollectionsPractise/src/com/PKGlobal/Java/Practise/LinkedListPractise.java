package com.PKGlobal.Java.Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class LinkedListPractise {
	
	
	static String [] inputList= { "January", "February", "March", "April", "May", "June", "July",
		    "august", "September", "October", "november", "December" }   ; 
			
			
			public static void main(String[] args) {
				
				
				
				LinkedList<String> months = new LinkedList<String>(Arrays.asList(inputList)) ;          
			      System.out.println("Unsorted List: "+months);
			      Collections.sort(months);
			      System.out.println("sorted List: "+months);
			       Collections.sort(months, String.CASE_INSENSITIVE_ORDER);
			       System.out.println("Sorted List with case senstive: "+months);
			      
			      
				
			}

}
