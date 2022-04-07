package com.abst;

class A
{
	String name="Suhas";
}
class B extends A
{
	String name="Sanjay";
	void print() 
	{
		System.out.println("This without super key word:"+ name);
		System.out.print("This with super key word:"+super.name);
		
	}
}

public class Example3 
{

	public static void main(String[] args) 
	{
		B a=new B();
		a.print();

	}

}
