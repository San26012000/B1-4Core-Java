package com.oops;

public class Constructor 
{
	String str;
	int a;
	Constructor(String b,int x)
	{
		str=b;
		a=x;
		
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	

	public static void main(String[] args)
	{
		Constructor c=new Constructor("welcome",23);
		c.display();
		
		
		

	}

}
