package com.collection;

import java.util.LinkedList;
import java.util.List;

public class link_list_ex {
	public static void main(String[] args) {
		//list<Integer> obj=new link_list_ex();
	
	List<Integer>obj=new LinkedList<>();
 obj.add(10);
 obj.add(20);
 
 obj.add(30);
 
 obj.add(40);
 
 obj.add(10);
 
 obj.add(null);       //add
 
 obj.add(null);
 System.out.println(obj);
	obj.remove(2);           //remove
	System.out.println(obj);
	
	
	System.out.println(obj.get(5));    //search
	obj.add(2, 100);            //retrive
	System.out.println(obj);
	
	}

}
