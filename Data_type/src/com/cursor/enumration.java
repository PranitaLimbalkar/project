package com.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class enumration {
	public static void main(String[] args) {
		Vector<Integer>obj=new Vector<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		/*for(Integer i:obj)
		{
			System.out.println(i);
		}
	*/
	
		Enumeration<Integer>e=obj.elements();
		while (e.hasMoreElements()) {
			//Integer integer = (Integer) e.nextElement();
			Integer i=e.nextElement();
			System.out.println(i);
		}
	}

}
