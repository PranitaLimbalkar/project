package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ex_2 {
	public static void main(String[] args) {
		Map<Integer, String> obj =new HashMap<Integer, String>();
		obj.put(10, "v1");
		obj.put(20, "v2");
		obj.put(30, "v3");
		obj.put(40, "v4");
		obj.put(50, "v5");
		System.out.println(obj);
		System.out.println(obj.get(50));
		Entry<Integer, String> entry;
		//Set<Entry<Integer, String> e=new obj.>
		Set<Integer>setobj;
		Set< Entry<Integer, String> >  allentry =obj.entrySet();
		for( Entry<Integer, String> e  :allentry)
		{
			Integer i =e.getKey();
			String value = e.getValue();
		
		if( i == 20)
		{
			e.setValue("v200");
		}
		
		System.out.println("Key : "+e.getKey());
		System.out.println("Value :" +e.getValue());
	
	}

}
}