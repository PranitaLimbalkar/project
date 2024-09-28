package com.string;

public class str_method {
public static void main(String[] args) {
	
	
	String str1="Java";
	String str2="Selenium";

	String s=str1.concat(str2);
	
	System.out.println(s);

	
  String str3="Java";
  String str4 ="Javaselenium";                //don string chi addition
  

  
  str3 = str3.toUpperCase();
  System.out.println(str3);             //str4 che sglr alphabet capital


  str4 = str4.toUpperCase();
  System.out.println(str4);              //str4 che sglr alphabet capital

  str4 = str4.toLowerCase();
  System.out.println(str4);              //str4 che sglr alphabet capital

  
  
  
  String s1="java";
  String s2="javaSelinum";
  
  	int i= s1.compareTo(s2);
  	
    System.out.println(i);              //compair krte donhi string mdhe je input same asel trch output "0"yete. o.w asski no yete
    
    
    //Reva  ReVa capital ki small without chek fkt same ahe ki nahi he chk krnar+
    String s3="Reva";
    String s4="reVa";
    
    int y =s3.compareToIgnoreCase(s4);
    System.out.println(y);
    
  char ch=s1.charAt(0);
   System.out.println(ch);               // charAt mdhe jo no input la dila asel tyach op print krt
   
   
   char ch1=s1.charAt(3);
   System.out.println(ch1);    
   
   
   boolean b= s3.contains("a");       // s3 chya string mdhe "a present ahe ka he check krte"
   System.out.println(b);
   
   int z=s1.indexOf("e");
   System.out.println(z);               //s1 chya string mdhe "e ha kiti no la ahe te check krte lile 0123"
   
   int z1=s1.lastIndexOf("v");
   System.out.println(z1);
   
   
   
   
   
   
   String s8="java";
   String s9="javaselineum";
   int z2=s9.lastIndexOf("i", 7);
   System.out.println(z2);
   
   boolean b1=s8.isEmpty();
   System.out.println(b1);            //string emplty ahe ki nahi chk krto
   
   
   int r=s1.length();
   System.out.println(r);
}


}
