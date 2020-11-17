package com.PKGlobal.Java.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetPractise {
	
	
	

	public static void main(String[] args) {
		
		String[] inputList = {"Book","Train","bike","Car","Bus"};

		
		
		Set<String> LHset = new LinkedHashSet<>(Arrays.asList(inputList));
		List<String> list=new ArrayList<String>(LHset);
		
		System.out.println(LHset.size());
		System.out.println(LHset);
		System.out.println(LHset.remove("water"));
		System.out.println(list.get(2));
		
		Iterator it=LHset.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
	}

}
