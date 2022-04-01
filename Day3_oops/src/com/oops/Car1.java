package com.oops;

public class Car1 
{
	String str;
	Car1(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("this is "+str);
	}
	

	public static void main(String[] args) 
	{
		Car1 a=new Car1("BMW");
		Car1 c=new Car1("BENZ");
		Car1 c1=new Car1("TATA");
		a.print();
		c1.print();
		c.print();
		
	}

}
