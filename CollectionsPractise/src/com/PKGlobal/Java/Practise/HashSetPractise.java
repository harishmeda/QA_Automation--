package com.PKGlobal.Java.Practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractise {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Bus");
		set.add("train");
		set.add("bike");

		Iterator it = set.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
