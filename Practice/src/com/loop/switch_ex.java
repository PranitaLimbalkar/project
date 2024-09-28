package com.loop;

public class switch_ex {
	public static void main(String[] args) {
		
		int i=0;
		String s="red";
		String y="yello";
		String z="green";
		
		switch("yellow")
		{
		case "red":
		{
			System.out.println("stop");
			break;
		}
		case "yellow":
		{
			System.out.println("go slow");
			break;
		}
		case "green":
		{
			System.out.println("go");
			break;
		}
		
		default:
		{
			System.out.println("some thing getting wrong");
			}
		}
	}

}
