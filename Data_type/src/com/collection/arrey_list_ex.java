package com.collection;

import java.util.ArrayList;

public class arrey_list_ex {
	public static void main(String[] args) {
	ArrayList<Integer> obj=new ArrayList<>();      //10-dedoult (0-9)

	/*obj.add(10);
	obj.add(10);
	obj.add(10);
	obj.add(10);
	obj.add(10);
	obj.add(10);
	obj.add(10);
	obj.add(10);
	System.out.println(obj.size());
		System.out.println(obj.size);

	*/	
	
	
	
	
	
	obj.add(10);
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	obj.add(40);
	obj.add(40);
	obj.add(50);
	obj.add(60);

	obj.add(60);

	obj.add(70);

	obj.add(80);

	obj.add(10);

	System.out.println(obj.size());
	System.out.println(obj);
	
	System.out.println(obj.remove(2));
	
	obj.add(2, 100);
	System.out.println(obj);
	
	
	
	obj.add(2, null);
	System.out.println(obj);
	
	
	
	System.out.println(obj.get(2));
	}

}
