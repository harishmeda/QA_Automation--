package com.PKGlobal.Java.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapPractise {
	
	


	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "989798");
		hmap.put(2,"February");
		hmap.put(1, "asdsd");
		hmap.put(3, "march");
		hmap.put(4,"April");
		hmap.put(5,"June");
		
		String var= hmap.get(1);
		System.out.println(var);
		String var1= hmap.remove(1);
		System.out.println(var1);
		
		for (Integer monN : hmap.keySet())  
        { 
            // search  for value 
            String month = hmap.get(monN); 
            System.out.println("Key = " + monN + ", Value = " +month ); 
        } 
	
		
		
		
		
		
		
}

}
