package com.collection;

import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set<String> obj=new HashSet<>();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.add("d");
		obj.add("e");
		obj.add(null);
		obj.add(null);
		System.out.println(obj);
		
		obj.remove("a");
		System.out.println(obj);
		for (String s:obj)
		{
			
			System.out.println(s);
		}
	
		}
	}


