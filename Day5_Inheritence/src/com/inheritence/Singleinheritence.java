package com.inheritence;

 class Parent
{
	void print()
	{
		System.out.println("hello,this is sanjay");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Singleinheritence");
		
	}
}
class Singleinheritence
{
	public static void main(String[] args) {
	{
		Child c=new Child();
		c.display();
		c.print();
	}

	}
}
