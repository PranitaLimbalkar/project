package com.exception;

public class ex_6 {
	

	public static void main(String[] args) {
		int i=10;  
		int j=0;    //j=100
		
		
		
		/*String s="mumbai";
		int ln=s.length();
		System.out.println(ln);
		String name=null;
		*/
		
		
		
		try {
		
		int div=i/j;                     //program terminate zalapudch o/p print nahi zal
		System.out.println("div: " +div);
		
	

		}
		
			catch (ArithmeticException e2) {
				
                   j=100;	
                //   System.out.println("j:"+j);
			}
		catch (NullPointerException e) {
			
			
			String nm="admin";
			//System.out.println("name:"+name);
		}
                   catch (Exception e) {
                	   
                   }
		
		
		
		
		System.out.println("j:"+j);
		//System.out.println("name:"+ name);
		
             }
			
			
			
			
		}

